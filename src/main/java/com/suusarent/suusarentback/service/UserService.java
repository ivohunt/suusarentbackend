package com.suusarent.suusarentback.service;


import com.suusarent.suusarentback.controller.user.dto.UserDto;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.presistence.role.Role;
import com.suusarent.suusarentback.presistence.role.RoleRepository;
import com.suusarent.suusarentback.presistence.user.User;
import com.suusarent.suusarentback.presistence.user.UserMapper;
import com.suusarent.suusarentback.presistence.user.UserRepository;
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
            throw new ForbiddenException("Sellise emailiga kasutaja on juba süsteemis olemas", 111);
        }
        ///  kas saab olla kaks samanimega kasutajat????
        Role role = roleRepository.getRoleCustomer();
        User user = userMapper.toUser(userDto);
        user.setRole(role);
        userRepository.save(user);;
    }

}
