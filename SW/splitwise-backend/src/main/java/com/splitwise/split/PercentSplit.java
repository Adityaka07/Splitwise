package com.splitwise.split;
import java.math.BigDecimal;
import com.splitwise.model.User;

public class PercentSplit extends Split {
    private double percent;
    public PercentSplit(User user,double percent)
    {
        super(user,BigDecimal.ZERO);                                    //passes zero into the superfunction, which eventually gives the 0value in big decimal to the split.java file, which gets the amount as zero for now refer the blog for more information
        //mandates that the super function should be written in the first line of the constructor. Can't write it after anything else
        //The JVM guarantees that parent class state is fully constructed and stabilized on the heap before the child class gets to execute any of its own logic. If Java allowed you to run child code before super(), you could accidentally call child methods that rely on parent fields that haven't been initialized yet.
        this.percent = percent;
    }
    @Override public boolean validate()
    {
        if(percent>0 && percent<=100)            //we cannot just keep the decimal number or the number into the if just like what we do in C++, because in Java the number arithmetiser does not convert to a billion if it is greater than or less than zero or anything other than zero, we have to explicitly confirm what we are writing
            return true;
        else 
            return false;
    }
    public void setAmountFromTotal(BigDecimal totalAmount)
    {
        setAmount(totalAmount.multiply(BigDecimal.valueOf(percent)).divide(new BigDecimal("100")));                            // always use BigDecimal.valueOf(percent) instead of new BigDecimal(double) because the oduble can by default with apoproximations and the bog decimal would just inherit them
    }
}
 