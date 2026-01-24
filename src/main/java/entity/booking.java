package entity;

import enums.BookStatus;
import enums.BookingTypes;
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
public class Booking  extends BaseEnitiy {
     @ManyToOne
    @JoinColumn(name = "camp_id")
    private Camp camp;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Camp customer;

    @Enumerated(EnumType.STRING)
    private BookingTypes bookingType = BookingTypes.day_use; // day_use or overnight

@Enumerated(EnumType.STRING)
    private BookStatus status = BookStatus.waiting; // waiting, approved, canceled
 
}
