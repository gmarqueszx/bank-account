package br.com.gmarqueszx.bankaccount.domain;

import br.com.gmarqueszx.bankaccount.services.ITransactions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class Account implements ITransactions {
    private Customer customer;
    private String accountNumber;
    private String agencyNumber;
    private double balance = 0.0;

    public Account(Customer customer, String accountNumber, String agencyNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", accountNumber='" + accountNumber + '\'' +
                ", agencyNumber='" + agencyNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
