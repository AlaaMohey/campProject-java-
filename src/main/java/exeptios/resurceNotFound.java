package exeptios;

public class ResurceNotFound extends RuntimeException {
    public ResurceNotFound(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
     
    }

}
