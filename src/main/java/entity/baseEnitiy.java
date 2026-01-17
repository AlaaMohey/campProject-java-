package entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;

    @Getter
    @Setter
    @MappedSuperclass
public abstract class BaseEnitiy {
 @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable  = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
   
}
