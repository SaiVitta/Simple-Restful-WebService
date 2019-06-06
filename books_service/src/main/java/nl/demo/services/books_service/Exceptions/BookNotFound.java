package nl.demo.services.books_service.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookNotFound extends  Exception{
    private static final long serialVersionUID = 1L;

    public BookNotFound(String message){
        super(message);
    }
}
