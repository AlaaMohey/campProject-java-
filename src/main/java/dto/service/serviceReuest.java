package dto.service;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class serviceReuest {

    @NotBlank
    private String name;
}
