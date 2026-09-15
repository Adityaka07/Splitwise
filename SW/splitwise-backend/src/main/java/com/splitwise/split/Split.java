package com.splitwise.split;

import java.math.BigDecimal;

import com.splitwise.model.User;

public abstract class Split {
    private User user;
    private BigDecimal amount;

    public Split(User user,BigDecimal amount)
    {
        this.user = user;
        this.amount = amount;
    }
    public abstract boolean validate();

public User getUser()
{
    return this.user;
}
public BigDecimal getAmount()
{
    return this.amount;
}
protected void setAmount(BigDecimal amount)
{
    this.amount = amount;
}

}