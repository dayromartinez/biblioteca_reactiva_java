package co.com.sofka.model;

import co.com.sofka.model.commons.enumerables.Status;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String names;

    private String surnames;

    private String identificationNumber;

    private String email;

    private String address;

    private String phone;

    private Status status;

    private ArrayList<Long> loanBooksIds;
}
