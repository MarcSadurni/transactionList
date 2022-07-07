package com.ironhack.interfaces.transaction;

import com.ironhack.interfaces.transactionList.TransactionList;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    private String sellerAccountNumber;
    private String buyerAccountNumber;
    private Double amount;
    private Date date;

    public Transaction(String sellerAccountNumber, String buyerAccountNumber, Double amount, Date date) {
        setSellerAccountNumber(sellerAccountNumber);
        setBuyerAccountNumber(buyerAccountNumber);
        setAmount(amount);
        setDate(date);
    }

    public String getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(String sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public String getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(String buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
