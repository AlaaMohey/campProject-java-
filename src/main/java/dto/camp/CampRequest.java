package dto.camp;

import java.math.BigDecimal;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class CampRequest {

    @NotBlank
    private String name;

    private String description;

    @NotBlank
    private String state;

    @NotNull
    private BigDecimal pricePerNight;

    @NotNull
    private Boolean hasOvernight;

    @NotNull
    private Long ownerId;

    private List<Long> serviceIds;
}
