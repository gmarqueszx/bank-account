package br.com.gmarqueszx.bankaccount.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Bank {
    private List<Account> accounts;

    public void displayAccountsData() {
        System.out.println("Accounts Data:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}
