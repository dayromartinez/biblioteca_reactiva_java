package co.com.sofka.application.adapters.entrypoints.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;

    private String title;

    private String author;

    private String gender;

    private String pages;

    private String editorial;

    private String description;

    private String image;

    private LocalDateTime releaseDate;
}
