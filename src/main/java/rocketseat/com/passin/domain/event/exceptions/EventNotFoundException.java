package rocketseat.com.passin.domain.event.exceptions;

public class EventNotFoundException extends RuntimeException{

    public EventNotFoundException(String message) {
        // passando a message para o constructor da RuntimeException
        super(message);
    }
}
