package co.com.sofka.model;

import co.com.sofka.model.commons.enumerables.Status;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lending {

    private Long id;

    private Long bookId;

    private Long userId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Status status;

}
