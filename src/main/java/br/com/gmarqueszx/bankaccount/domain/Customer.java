package br.com.gmarqueszx.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String cpf;
}
