package exeptios;

public class resurceNotFound extends RuntimeException {
    public resurceNotFound(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
     
    }

}
