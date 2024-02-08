package co.com.sofka.application.adapters.driveradapters.sql;
import co.com.sofka.model.Book;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface BookRepositoryAdapter {

    Optional<Book> findByBookId(Long bookId);

}
