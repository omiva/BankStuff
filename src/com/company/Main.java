package com.company;

public class Main {

    public static void main(String[] args)
    {
        ThisBank hemsAcc = new ThisBank();
        {
            hemsAcc.deposit(102);
            hemsAcc.withdraw(100);
        }
    }
}
