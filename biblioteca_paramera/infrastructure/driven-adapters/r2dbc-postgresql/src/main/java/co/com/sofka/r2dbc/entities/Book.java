package co.com.sofka.r2dbc.entities;

import co.com.sofka.model.commons.enumerables.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BOOK", schema = "SOFKA")
public class Book {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "PAGES")
    private String pages;

    @Column(name = "EDITORIAL")
    private String editorial;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "RELEASE_DATE")
    private LocalDateTime releaseDate;

    @Column(name = "STATUS", nullable = false)
    private String status;
}
