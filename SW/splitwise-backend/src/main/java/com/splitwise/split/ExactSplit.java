package com.splitwise.split;

import java.math.BigDecimal;

import com.splitwise.model.User;

public class ExactSplit extends Split{
    public ExactSplit(User user,BigDecimal amount)
    {
        super(user,amount);
    }
    @Override public boolean validate()
    {
        if(getAmount().compareTo(BigDecimal.ZERO)>0)            //we cannot just keep the decimal number or the number into the if just like what we do in C++, because in Java the number arithmetiser does not convert to a billion if it is greater than or less than zero or anything other than zero, we have to explicitly confirm what we are writing
            return true;
        else 
            return false;
    }

}
