package exeptios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class global {
@ExceptionHandler(resurceNotFound.class)
    public apiRes<String> handleResourceNotFound(resurceNotFound ex) {
        return new apiRes<>("Resource not found", false, ex.getMessage());
    }
    //     @ExceptionHandler(Exception.class)
    // public ResponseEntity<apiRes<Object>> handleGeneral(Exception ex) {
    //             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    //                     .body(new apiRes<Object>(false, "Something went wrong", null));
    // }
}
    