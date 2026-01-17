package entity;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Users")
@Getter
@Setter
public class User extends BaseEnitiy {
    @Column(nullable = false)
    private String name;
    @Column(unique =  true)
    private String email;
    @Enumerated(EnumType.STRING)
    private enums.UserRole role;
    private Boolean isActive = true;

}
