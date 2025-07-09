package br.com.gmarqueszx.bankaccount.executable;

import br.com.gmarqueszx.bankaccount.domain.CheckingAccount;
import br.com.gmarqueszx.bankaccount.domain.Customer;
import br.com.gmarqueszx.bankaccount.domain.SavingsAccount;

import java.time.LocalDate;

public class BackAccountMain {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2005, 9, 7);
        Customer customer = new Customer("João Gabriel", "Marques Pessoa de Souza", "bielpesso" +
                "@gmail.com", "77999290577", "45853409808", birthDate);

        CheckingAccount checkingAccount = new CheckingAccount( customer,"45891", "21", 10000, 1000);
        checkingAccount.deposit(2000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(11000);
        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount);

        System.out.println("====================");

        SavingsAccount savingsAccount = new SavingsAccount(customer, "52543", "30", 0);
        savingsAccount.deposit(2000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println(savingsAccount.getBalance());




    }

}
