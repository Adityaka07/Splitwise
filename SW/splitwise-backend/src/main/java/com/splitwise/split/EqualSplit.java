package com.splitwise.split;
import com.splitwise.model.User;
import java.math.BigDecimal;

public class EqualSplit extends Split {
    public EqualSplit(User user,BigDecimal amount)
    {
        super(user,amount);
    }
    @Override public boolean validate()
    {
        return true;
    }
}
