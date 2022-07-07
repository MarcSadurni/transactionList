package com.ironhack.interfaces;

import com.ironhack.interfaces.paymentList.PaymentList;
import com.ironhack.interfaces.transaction.Transaction;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PaymentList paymentList = new PaymentList();
        paymentList.addTransaction(new Transaction( "111",  "2222", 222.0, new Date()));
        System.out.println(paymentList.getAllTransaction());
    }
}
