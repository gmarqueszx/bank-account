package br.com.gmarqueszx.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Account {
    private String accountNumber;
    private String agencyNumber;
    private double balance;

    public double deposit(double amount) {
        return balance + amount;
    }

    public double withdraw(double amount) {
        if (balance - amount < 0) {
            throw new RuntimeException("Insufficient balance");
        } else {
            return balance -= amount;
        }
    }

}
