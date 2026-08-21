package mk.ukim.finki.wp.june2025g1.model.exceptions;

public class InvalidStartupIdException extends RuntimeException {
    public InvalidStartupIdException(Long startupid) {
        super(String.format("Startup with id %d does not exist.", startupid));
    }
}