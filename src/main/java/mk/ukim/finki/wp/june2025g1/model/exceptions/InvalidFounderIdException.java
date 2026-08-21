package mk.ukim.finki.wp.june2025g1.model.exceptions;

public class InvalidFounderIdException extends RuntimeException {
    public InvalidFounderIdException(Long founderid) {
        super(String.format("Founder with id %d does not exist.", founderid));
    }
}
