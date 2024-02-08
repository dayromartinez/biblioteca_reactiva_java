package co.com.sofka.r2dbc.repositories;

import co.com.sofka.r2dbc.entities.LendingEntity;
import co.com.sofka.r2dbc.entities.UserEntity;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface UserEntityRepository extends ReactiveCrudRepository<UserEntity, Long>, ReactiveQueryByExampleExecutor<Object> {

    Optional<UserEntity> findUserEntityById(Long id);

}
