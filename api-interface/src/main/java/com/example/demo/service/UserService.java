package com.example.demo.service;
import com.example.demo.dto.UserDto;
import java.util.List;
public interface UserService {
    List<UserDto> selectAllUser(UserDto userDto);
}
