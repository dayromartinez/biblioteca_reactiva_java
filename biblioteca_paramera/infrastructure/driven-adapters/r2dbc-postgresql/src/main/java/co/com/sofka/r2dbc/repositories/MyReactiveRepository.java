package co.com.sofka.r2dbc.repositories;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MyReactiveRepository extends ReactiveCrudRepository<Object, String>, ReactiveQueryByExampleExecutor<Object> {

}
