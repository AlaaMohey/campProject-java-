package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "cmp_images")
@Entity
public class camp_image {
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "camp_id")
    private camp camp;
}
