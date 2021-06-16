package com.example.demo.controllers;


import com.example.demo.client.BankClient;
import com.example.demo.domain.User;
//import com.example.demo.model.UserDto;
import com.example.demo.services.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    private  final UserService userService ;

    private final BankClient bankClient ;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers() ;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") Long userId) {

        return new ResponseEntity<>(userService.getById(userId), HttpStatus.OK) ;
    }


    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated User userDto) {


        System.out.println(bankClient.getBankById(1L));
        User user = userDto ;
        String ban_name = bankClient.getBankById(1L);
//        System.out.println(id);
        user.setBank_id(ban_name);
        return new ResponseEntity<>(userService.saveNewUSer(user), HttpStatus.CREATED) ;
    }
    @PutMapping("/{userId}")
    public ResponseEntity updateUserById(@PathVariable("userId") Long userId, @RequestBody @Validated User userDto){
        return new ResponseEntity<>(userService.updateUser(userId, userDto), HttpStatus.NO_CONTENT);
    }
}
