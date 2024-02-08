package co.com.sofka.application.adapters.driveradapters.sql;
import co.com.sofka.model.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepositoryAdapter {

    Optional<User> findByUserId(Long userId);

}
