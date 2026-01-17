package entity;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "users")
@Getter
@Setter
public class user extends baseEnitiy {
    @Column(nullable = false)
    private String name;
    @Column(unique =  true)
    private String email;
    @Enumerated(EnumType.STRING)
    private enums.userRole role;
    private Boolean isActive = true;

}
