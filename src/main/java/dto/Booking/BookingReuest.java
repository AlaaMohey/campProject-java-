package dto.Booking;

import java.time.LocalDate;

import enums.BookingTypes;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookingReuest {
  @NotNull
    private Long campId;

    @NotNull
    private Long customerId;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

    @NotNull
    private BookingTypes bookingType;
}
