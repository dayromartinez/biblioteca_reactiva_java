package co.com.sofka.r2dbc.repositories;

import co.com.sofka.r2dbc.entities.GenderEntity;
import co.com.sofka.r2dbc.entities.LendingEntity;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface LendingEntityRepository extends ReactiveCrudRepository<LendingEntity, Long>, ReactiveQueryByExampleExecutor<Object> {

    Optional<LendingEntity> findLendingEntityById(Long id);

}
