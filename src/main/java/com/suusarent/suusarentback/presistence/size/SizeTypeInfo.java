package com.suusarent.suusarentback.presistence.size;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Size}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SizeTypeInfo implements Serializable {

    @NotNull
    @jakarta.validation.constraints.Size(max = 10)
    private String sizeType;
}