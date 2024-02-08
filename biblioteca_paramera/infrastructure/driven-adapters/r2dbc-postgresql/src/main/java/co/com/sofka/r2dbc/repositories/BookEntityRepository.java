package co.com.sofka.r2dbc.repositories;

import co.com.sofka.r2dbc.entities.BookEntity;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface BookEntityRepository extends ReactiveCrudRepository<BookEntity, Long>, ReactiveQueryByExampleExecutor<Object> {

    Optional<BookEntity> findBookEntityById(Long id);

}
