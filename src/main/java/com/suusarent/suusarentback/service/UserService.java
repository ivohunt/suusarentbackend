package com.suusarent.suusarentback.service;


import com.suusarent.suusarentback.Error;
import com.suusarent.suusarentback.controller.user.dto.UserDto;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.persistence.role.Role;
import com.suusarent.suusarentback.persistence.role.RoleRepository;
import com.suusarent.suusarentback.persistence.user.User;
import com.suusarent.suusarentback.persistence.user.UserMapper;
import com.suusarent.suusarentback.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    public void addUser(UserDto userDto) {
        if (userRepository.userExistsBy(userDto.getEmail())) {
            throw new ForbiddenException(Error.EMAIL_ALREADY_EXISTS.getMessage(), Error.EMAIL_ALREADY_EXISTS.getErrorCode());
        }
        Role role = roleRepository.getRoleCustomer();
        User user = userMapper.toUser(userDto);
        user.setRole(role);
        userRepository.save(user);
    }

}
