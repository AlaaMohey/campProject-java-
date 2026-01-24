package dto.user;

import enums.UserRole;
import lombok.Data;
@Data
public class UserResponse {
   private Long id;
    private String fullName;
    private String phone;
    private String email;
    private UserRole role;
    private Boolean isActive;
}
