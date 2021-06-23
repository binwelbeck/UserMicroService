package com.example.demo.services;

import com.example.demo.controllers.NotFoundException;
import com.example.demo.domain.User;

//import com.example.demo.model.UserDto;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository ;


    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getById(Long userId) {
        userRepository.findById(userId);
        return (
                userRepository.findById(userId).orElseThrow(NotFoundException::new)
        ) ;
    }

    @Override
    public User saveNewUSer(User userDto) {
        return userRepository.save(userDto);
    }


    @Override
    public User updateUser(Long userId, User userDto) {

        User user = userRepository.findById(userId).orElseThrow(NotFoundException::new) ;

        user.setUsername (userDto.getUsername());
        user.setBank_id(userDto.getBank_id());
        user.setRegisteredBy(userDto.getRegisteredBy());
        user.setRole(userDto.getRole());
        user.setLastModifiedDate(user.getLastModifiedDate());
        user.setPassword(user.getPassword());

        userRepository.save(user) ;
        return user;

    }
}
