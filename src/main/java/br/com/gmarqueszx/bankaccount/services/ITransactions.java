package br.com.gmarqueszx.bankaccount.services;

public interface ITransactions {
    void deposit(double amount);
    void withdraw(double amount);
}
