package co.com.sofka.model;

import co.com.sofka.model.commons.enumerables.Status;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;

    private String title;

    private String author;

    private String gender;

    private String pages;

    private String editorial;

    private String description;

    private String image;

    private LocalDateTime releaseDate;

    private Status status;
}
