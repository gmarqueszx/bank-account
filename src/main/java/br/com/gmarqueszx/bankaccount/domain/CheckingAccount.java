package br.com.gmarqueszx.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account {
    private double annualCheckLimit;

    public CheckingAccount(String accountNumber, String agencyNumber, double balance, double annualCheckLimit) {
        super(accountNumber, agencyNumber, balance);
        this.annualCheckLimit = annualCheckLimit;
    }


    @Override
    public double withdraw(double amount) {
        double balanceAddedCredit = getBalance() + annualCheckLimit;
        if (balanceAddedCredit - amount < 0) {
            throw new RuntimeException("Insufficient balance");
        } else {
             setBalance(getBalance() - amount);
        }
        return getBalance();
    }
}
