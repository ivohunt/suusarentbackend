package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.login.dto.LoginResponse;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import com.suusarent.suusarentback.persistence.user.User;
import com.suusarent.suusarentback.persistence.user.UserMapper;
import com.suusarent.suusarentback.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.suusarent.suusarentback.Error.INCORRECT_CREDENTIALS;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final OrderService orderService;
    private final OrderRepository orderRepository;


    public LoginResponse login(String email, String password) {
        User user = getValidUser(email, password);
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        handleAddOpenOrderInfo(user, loginResponse);
        return loginResponse;
    }

    private void handleAddOpenOrderInfo(User user, LoginResponse loginResponse) {
        Optional<Order> optionalOrder = orderRepository.findOrderBy(user.getId(), Status.PENDING_RENTAL.getCode());
        boolean userHasOpenOrder = optionalOrder.isPresent();

        loginResponse.setUserHasOpenOrder(userHasOpenOrder);
        if (userHasOpenOrder) {
            loginResponse.setOrderId(optionalOrder.get().getId());
        } else {

        }
    }

    private User getValidUser(String email, String password) {
        return userRepository.findUserBy(email, password, Status.ACTIVE_USER.getCode())
                .orElseThrow(() -> new ForbiddenException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode()));
    }
}
