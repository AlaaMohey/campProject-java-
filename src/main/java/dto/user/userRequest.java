package dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class userRequest {
  @NotBlank
    private String name;
      private String email;

      @NotNull
    private String role;
}
