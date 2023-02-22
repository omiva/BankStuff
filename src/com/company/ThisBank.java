package com.company;

public class ThisBank
{
    private int number,phone_no;
    private double balance;
    private String customer_name,email_id;

    public void deposit(double depositAmount)
    {
        this.balance=this.balance+depositAmount;
        System.out.println("deposit amount made= "+depositAmount+". the new balance is "+this.balance);
    }
    public void withdraw(double withdrawalAmount)
    {
        if(this.balance-withdrawalAmount<0)
        {
            System.out.println("Only "+this.balance+" is available, withdrawal not processed");
        }
        else {
            this.balance=this.balance-withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" is processed. remaining balance = "+this.balance);
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
