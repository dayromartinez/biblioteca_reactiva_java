package co.com.sofka.r2dbc.adapters;

import co.com.sofka.application.adapters.driveradapters.sql.BookRepositoryAdapter;
import co.com.sofka.model.Book;
import co.com.sofka.r2dbc.repositories.BookEntityRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookEntityRepositoryAdapterImpl implements BookRepositoryAdapter {


    private final BookEntityRepository repository;

    public BookEntityRepositoryAdapterImpl(BookEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Book> findByBookId(Long bookId) {
        return Optional.empty();
    }
}
