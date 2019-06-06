package nl.demo.services.books_service.infrastructure.persistence;

import nl.demo.services.books_service.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository {
}
