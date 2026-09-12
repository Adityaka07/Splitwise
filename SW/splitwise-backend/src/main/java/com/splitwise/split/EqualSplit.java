package com.splitwise.split;
import com.splitwise.model.Expense;                                         //thought we would need this for the expense info but expense info is not used--the values are diereclt passed

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EqualSplit {
    private BigDecimal amount;
    private int numberOfPeople;

public EqualSplit(String Amount,int numberOfPeople)
{
    this.amount = new BigDecimal(Amount);
    this.numberOfPeople = numberOfPeople;
}
public BigDecimal getSplitValue()
{
    return this.amount.divide(BigDecimal.valueOf(this.numberOfPeople),2,RoundingMode.HALF_UP);            //how to convert the number of people in integer to big decimal because we can only put big decimals in the particular function of divide.
}


}