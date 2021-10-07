package com.example.demo.mapper;
import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserMapper {
    /**
     * 查询用户信息
     * @return
     */
    List<UserDto> selectAllUser(UserDto userDto);
}
