package br.com.gmarqueszx.bankaccount.executable;

import br.com.gmarqueszx.bankaccount.domain.CheckingAccount;
import br.com.gmarqueszx.bankaccount.domain.Customer;
import br.com.gmarqueszx.bankaccount.domain.SavingsAccount;
import br.com.gmarqueszx.bankaccount.view.BankMenu;

import java.time.LocalDate;

public class BankAccountMain {
    public static void main(String[] args) {
        BankMenu menu = new BankMenu();
        menu.start();



    }

}
