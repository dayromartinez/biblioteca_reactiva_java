package co.com.sofka.r2dbc.repositories;

import co.com.sofka.r2dbc.entities.EditorialEntity;
import co.com.sofka.r2dbc.entities.GenderEntity;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.Optional;

public interface GenderEntityRepository extends ReactiveCrudRepository<GenderEntity, Long>, ReactiveQueryByExampleExecutor<Object> {

    Optional<GenderEntity> findGenderEntityById(Long id);

}
