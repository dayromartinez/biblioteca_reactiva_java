package co.com.sofka.r2dbc.repositories;

import co.com.sofka.r2dbc.entities.AuthorEntity;
import co.com.sofka.r2dbc.entities.EditorialEntity;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface EditorialEntityRepository extends ReactiveCrudRepository<EditorialEntity, Long>, ReactiveQueryByExampleExecutor<Object> {

    Optional<EditorialEntity> findEditorialEntityById(Long id);

}
