package co.com.sofka.application.adapters.driveradapters.sql;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface AuthorRepositoryAdapter {

    Optional<String> findByAuthorId(Long authorId);

}
