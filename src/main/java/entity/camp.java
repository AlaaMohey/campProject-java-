package entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity

@Table(name = "camps")
public class Camp  extends BaseEnitiy {
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String state;

    private BigDecimal pricePerNight;

    private Boolean hasOvernight;

    private Boolean isApproved = false;  private String campName;
    private String location;
   // صاحب المخيم
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

@ManyToMany
   @JoinTable(
            name = "camp_services",
            joinColumns = @JoinColumn(name = "camp_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
        private List<Service> services;
}
