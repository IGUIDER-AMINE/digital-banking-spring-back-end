package ma.enset.projetbackend.exceptions;

// exception non surveillées
// extends RuntimeException
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
