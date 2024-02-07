package co.com.sofka.r2dbc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER", schema = "SOFKA")
public class User {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAMES", nullable = false)
    private String names;

    @Column(name = "SURNAMES", nullable = false)
    private String surnames;

    @Column(name = "IDENTIFICATION_NUMBER", nullable = false)
    private String identificationNumber;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "STATUS", nullable = false)
    private String status;

}
