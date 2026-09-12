package com.splitwise;
import com.splitwise.model.Group;
import com.splitwise.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.splitwise.model.Expense;
import com.splitwise.split.EqualSplit;

public class Main {
    public static void main(String[] args) {
        User U1 = new User("Aditya");
        User U2 = new User("u2");
        User U3 = new User("u3");
        Group group1 = new Group("Trip");
        System.out.println(U1.toString());
        System.out.println(U2.toString());
        System.out.println(U3.toString());
        group1.addMember(U3);
        group1.addMember(U1);
        group1.addMember(U2);
        group1.addMember(U1);                               //testing the ad-members function in the group class works as I try to input the user one twice
        List<User> takers = new ArrayList<>();
        takers.add(U1);
        takers.add(U2);
        takers.add(U3);
        
        Expense dinnerExpense = new Expense(U1,"dinner", "300", takers);
        group1.addExpense(dinnerExpense);
        System.out.println(group1);
        EqualSplit dinnerEqualSplit = new EqualSplit(dinnerExpense.getAmount().toString(),dinnerExpense.getTakers().size());              //need to convert amount to string as its a bigDecomal and it needa. a string as input--does the rest automatically -- done in the QuualSplit class
        BigDecimal sharePerPerson = dinnerEqualSplit.getSplitValue();

        System.out.println("Expense Summary");
        System.out.println("Total Amount: " + dinnerExpense.getAmount());
        System.out.println("Calculated Share Per Person: ₹" + sharePerPerson);
        System.out.println("\nParticipant Breakdown:");
        for (User taker : dinnerExpense.getTakers()) {
            System.out.println(taker.getName() + " owes ₹" + sharePerPerson);
        }
    }
}
