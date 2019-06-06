package nl.demo.services.books_service.Application;

import nl.demo.services.books_service.Exceptions.BookNotFound;
import nl.demo.services.books_service.domain.Book;
import nl.demo.services.books_service.infrastructure.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List getAllBooks(){
        List books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBook(String id) {
//        return bookRepository.findById(id).orElseGet(Book::new);
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFound("Book not found for id: " +id));

    }

    public void addBook(Book GameOfThrones){
        bookRepository.save(GameOfThrones);
    }

    public void updateBook(String id,Book GameOfThrones){
        bookRepository.save(GameOfThrones);
    }

    public void deleteBook(String id){
        bookRepository.deleteById(id);
    }


}
