package com.wildvash.hh.controllers;

import com.wildvash.hh.models.UserDto;
import com.wildvash.hh.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public UserDto createUser(UserDto userDto) {
        return userService.createUser(userDto);
    }
}
