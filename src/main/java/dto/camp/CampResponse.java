package dto.camp;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class CampResponse {
    private Long id;
    private String name;
    private String description;
    private String state;
    private BigDecimal pricePerNight;
    private Boolean hasOvernight;
    private Boolean isApproved;

    private String ownerName;
    private List<String> services;
    private List<String> images;
}
