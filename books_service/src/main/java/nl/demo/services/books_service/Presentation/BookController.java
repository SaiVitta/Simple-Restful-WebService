package nl.demo.services.books_service.Presentation;

import nl.demo.services.books_service.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List getAllBooks(){
        return bookservice.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable String bookId){
        return bookservice.getBook(bookId);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        bookservice.addBook(book);

    }

    @PutMapping("/books/{id}")
    public void updateBook(@PathVariable String bookId,@RequestBody Book book){
        bookservice.updateBook(bookId,book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable String bookId){
        bookservice.deleteBook(bookId);
    }

}
