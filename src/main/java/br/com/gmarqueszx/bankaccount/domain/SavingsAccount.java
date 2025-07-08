package br.com.gmarqueszx.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SavingsAccount extends Account {
    private double annualIncome = 6.69;

}
