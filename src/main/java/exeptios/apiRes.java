package exeptios;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiRes<T> {
    private String message;
    private boolean success;
    private T data;

}
