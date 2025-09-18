package com.suusarent.suusarentback.presistence.user;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {
    private Integer id;
    private Integer roleId;
    private String roleName;
    @NotNull
    @Size(max = 16)
    private String password;
    @NotNull
    @Size(max = 255)
    private String email;
    @NotNull
    @Size(max = 1)
    private String status;
    @NotNull
    private Instant createdAt;
}