package co.com.sofka.application.adapters.driveradapters.sql;
import co.com.sofka.model.Lending;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface LendingRepositoryAdapter {

    Optional<Lending> findByLendingId(Long lendingId);

}
