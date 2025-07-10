package br.com.gmarqueszx.bankaccount.domain;

import br.com.gmarqueszx.bankaccount.exception.InsufficientBalance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.MonthDay;

@Getter
@Setter
public class SavingsAccount extends Account {
    private static final double MONTHLY_INTEREST_RATE = 0.0055;

    public SavingsAccount(Customer customer, String accountNumber, String agencyNumber) {
        super(customer, accountNumber, agencyNumber);
    }


    public void applyMonthlyincome() {
        double income = getBalance() * MONTHLY_INTEREST_RATE;
        setBalance(getBalance() + income);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            throw new InsufficientBalance("Insufficient balance to carry out the transaction");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void transfer(double amount) {

    }
}
