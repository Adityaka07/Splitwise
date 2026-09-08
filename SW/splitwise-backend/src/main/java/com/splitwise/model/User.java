package com.splitwise.model;

public class User {
    private String name;
    private String userID;                           //did not add the user ID string earlier, but Gemini told me so because the names can be same, which I could have thought if I spent more time on ideation
    private double balance;                         //made a rookie mistake here-added balances as int not double
 
    public User(String name,String userID,int balance)      //made a mistake here too, as the constructor in Java do not have a return type, not even void or int---also did not add a access modifier to the constructor
    {
        this.name = name;
        this.userID = userID;
        this.balance = balance;
    }

    public String getName() 
    {
        return this.name;
    }
    public String getUserID() 
    {
        return this.userID;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void increaseBalance(double n)              //I made two different functions for increasing and decreasing the balance because I don't want to get into negative changing in balances or something like that. I could change it afterwards too
    {
        this.balance +=n;
    }
    public void decreaseBalance(double n)
    {
        this.balance -=n;
    }
}
