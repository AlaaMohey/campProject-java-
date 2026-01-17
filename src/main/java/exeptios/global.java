package exeptios;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class Global {
@ExceptionHandler(ResurceNotFound.class)
    public ApiRes<String> handleResourceNotFound(ResurceNotFound ex) {
        return new ApiRes<>("Resource not found", false, ex.getMessage());
    }
    //     @ExceptionHandler(Exception.class)
    // public ResponseEntity<apiRes<Object>> handleGeneral(Exception ex) {
    //             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    //                     .body(new apiRes<Object>(false, "Something went wrong", null));
    // }
}
    