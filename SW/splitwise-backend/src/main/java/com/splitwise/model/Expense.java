package com.splitwise.model;
import java.math.BigDecimal;
import java.time.*;
import java.util.List;                                                              //we did not import the array list package because we are no longer initialising a empty list here, we are directly getting the list of users from the constructor itself, so we do not care much
import java.util.UUID;



public class Expense {
    private String transactionId;                                                   //did the rookie mistake of making the transaction ID as a Internet string as the UUID function makes a string?
    private User lender;
    private List<User> taker;
    private String description;
    private BigDecimal amount;
    private LocalDateTime timestamp;

public Expense(User lender,String description,String amount,List<User> takers)      //earlier app did not pass the list of takers in the constructor, and I wanted to make a add members/takers function to the class, but this would be better
{
    this.transactionId = UUID.randomUUID().toString(); 
    this.lender = lender;
    this.taker = takers;
    this.description = description;
    this.amount = new BigDecimal(amount);
    this.timestamp = LocalDateTime.now();
}

public String getTransactionID()
{
    return this.transactionId;
}
public User getLender()
{
    return this.lender;
}
public String getDescription()
{
    return this.description;
}
public BigDecimal getAmount()
{
    return this.amount;
}
public List<User> getTakers()
{
    return this.taker;
}
public LocalDateTime getTimestamp()
{
    return this.timestamp;
}
@Override public String toString()
{
    return "Expense{Transaction Id="+this.transactionId+",Lender="+this.lender+"Takers = "+this.taker+"Amount = "+this.amount+" Description = "+this.description+" Created at = "+this.timestamp+"}";
}

}

