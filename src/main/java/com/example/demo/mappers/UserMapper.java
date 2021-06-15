package com.example.demo.mappers;

import com.example.demo.domain.User;
import com.example.demo.model.UserDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface UserMapper {
    UserDto userToUserDto(User user) ;

    User userDtoToUser(UserDto userDto) ;
}
