package entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "reviews")
   
 @Entity
public class Reviews  extends BaseEnitiy {
   
private Integer rating;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "camp_id")
                private Camp camp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
 
}
