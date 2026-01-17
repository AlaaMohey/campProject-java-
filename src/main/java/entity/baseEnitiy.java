package entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;

    @Getter
    @Setter
public abstract class baseEnitiy {
 @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable  = false)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @persistence
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
    @persistence
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
   
}
