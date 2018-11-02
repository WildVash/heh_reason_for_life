package com.wildvash.hh.services;

import com.wildvash.hh.models.User;
import com.wildvash.hh.models.UserDto;
import com.wildvash.hh.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto createUser(UserDto userDto) {
        User savedUser = userRepository.save(
                User.builder()
                        .id(2)
                        .firstName("Masha")
                        .lastName("Petrova").build());
        return UserDto.builder()
                .id(savedUser.getId())
                .firstName(savedUser.getFirstName())
                .lastName(savedUser.getLastName())
                .build();
    }
}
