package com.example.demo.service;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
@Component("UserService")
@Service(interfaceClass = UserService.class, version = "1.0.0", timeout =1200000)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> selectAllUser(UserDto userDto) {
        return userMapper.selectAllUser(userDto);
    }
}
