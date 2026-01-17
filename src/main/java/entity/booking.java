package entity;

import enums.bookStatus;
import enums.bookingTypes;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "bookings")
   
 @Entity
public class booking  extends baseEnitiy {
     @ManyToOne
    @JoinColumn(name = "camp_id")
    private camp camp;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private camp customer;

    @Enumerated(EnumType.STRING)
    private bookingTypes bookingType = bookingTypes.day_use; // day_use or overnight

@Enumerated(EnumType.STRING)
    private bookStatus status = bookStatus.waiting; // waiting, approved, canceled
 
}
