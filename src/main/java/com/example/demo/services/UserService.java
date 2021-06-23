package com.example.demo.services;

import com.example.demo.domain.User;
//import com.example.demo.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public interface UserService {

    List<User> getAllUsers();

    User getById(Long userId);

    User saveNewUSer(User userDto);

    User updateUser(Long userId, User userDto);
}
