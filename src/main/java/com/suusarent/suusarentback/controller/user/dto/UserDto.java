package com.suusarent.suusarentback.controller.user.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.suusarent.suusarentback.presistence.user.User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    @NotNull
    @Size(max = 255)
    private String firstName;

    @NotNull
    @Size(max = 255)
    private String lastName;

    @NotNull
    @Size(max = 255)
    private String email;

    @NotNull
    @Size(max = 16)
    private String telephone;

    @NotNull
    @Size(max = 16)
    private String password;
}