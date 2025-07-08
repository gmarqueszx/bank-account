package br.com.gmarqueszx.bankaccount.executable;

import br.com.gmarqueszx.bankaccount.domain.CheckingAccount;
import br.com.gmarqueszx.bankaccount.domain.Customer;

public class BackAccountMain {
    public static void main(String[] args) {
        Customer customer = new Customer("João Gabriel", "Marques Pessoa de Souza", "bielpesso" +
                "@gmail.com", "77999290577", "45853409808" );

        CheckingAccount checkingAccount = new CheckingAccount("45891", "21", 10000, 1000);
        checkingAccount.deposit(2000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(11000);
        System.out.println(checkingAccount.getBalance());




    }

}
