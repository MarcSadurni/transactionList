package com.ironhack.interfaces.paymentList;

import com.ironhack.interfaces.transaction.Transaction;
import com.ironhack.interfaces.transactionList.TransactionList;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList {

    ArrayList<Transaction> allTransaction = new ArrayList<>();

    @Override
    public Transaction getLastTransaction() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }

    @Override
    public Transaction getTransactionByDate(Date date) {
        return null;
    }

    @Override
    public ArrayList<Transaction> getAllTransaction() {
        return null;
    }
}
