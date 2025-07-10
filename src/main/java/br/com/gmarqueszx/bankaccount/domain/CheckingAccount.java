package br.com.gmarqueszx.bankaccount.domain;

import br.com.gmarqueszx.bankaccount.exception.InsufficientBalance;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(Customer customer, String accountNumber, String agencyNumber, double overdraftLimit) {
        super(customer, accountNumber, agencyNumber);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        double balanceAddedCredit = getBalance() + overdraftLimit;
        if (balanceAddedCredit - amount < 0) {
            throw new InsufficientBalance("Insufficient balance to carry out the transaction");
        } else {
             setBalance(getBalance() - amount);
        }
    }

    @Override
    public void transfer(double amount) {

    }

}
