package com.example.demo.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/user")
public class UserController{
    @Reference(interfaceClass = UserService.class, version = "1.0.0",check = false,timeout = 30000,retries = 0)
    private UserService userService;
    /**
     * 查询所有用户
     * @return 返回所有用户
     */
    @GetMapping("/query")
    public Map<String,Object> query(UserDto userDto) {
        HashMap<String, Object> restultMap = new HashMap<>();
        List<UserDto> userList = userService.selectAllUser(userDto);
        restultMap.put("userList", userList);
        return restultMap;
    }

}
