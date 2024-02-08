package co.com.sofka.application.adapters.driveradapters.sql;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface EditorialRepositoryAdapter {

        Optional<String> findByEditorialId(Long editorialId);

}
