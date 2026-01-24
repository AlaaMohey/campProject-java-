package dto.Booking;

import java.time.LocalDate;

import enums.BookStatus;
import enums.BookingTypes;
import lombok.Data;
@Data
public class BookingResponse {
   private Long id;
    private String campName;
    private String customerName;
    private LocalDate startDate;
    private LocalDate endDate;
    private BookingTypes bookingType;
    private BookStatus status;
}
