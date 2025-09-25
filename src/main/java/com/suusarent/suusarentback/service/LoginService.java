package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.login.dto.LoginResponse;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.persistence.user.User;
import com.suusarent.suusarentback.persistence.user.UserMapper;
import com.suusarent.suusarentback.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.suusarent.suusarentback.Error.INCORRECT_CREDENTIALS;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public LoginResponse login(String email, String password) {
        User user = getValidUser(email, password);
        return userMapper.toLoginResponse(user);
    }

    private User getValidUser(String email, String password) {
        return userRepository.findUserBy(email, password, Status.ACTIVE.getCode())
                .orElseThrow(() -> new ForbiddenException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode()));
    }
}
