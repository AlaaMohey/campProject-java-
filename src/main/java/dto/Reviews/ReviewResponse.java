package dto.Reviews;

import lombok.Data;

@Data
public class ReviewResponse {
    private Long id;
    private Integer rating;
    private String comment;
    private String userName;
}
