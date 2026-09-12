package com.splitwise.model;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class Group {
    private String groupID;
    private String groupName;
    private List<User> users;                           //this is the place which is a list in which we will store all the users object, the data type of this list is the user object, so we can store the whole object in this, not only the user IDs or stuff
    private List<Expense> expenses;

    public Group(String groupName)
    {
        this.groupID = UUID.randomUUID().toString();
        this.groupName = groupName;
        this.users = new ArrayList<>();
        this.expenses = new ArrayList<>();
    }

    public void addMember(User newUser)
    {
        for(User U : users)
        {
            if(U.getUserID().equals(newUser.getUserID()))
            {
                System.out.println("this user already exists");
                return;
            }
        }
        this.users.add(newUser);
    }
    public void addExpense(Expense newExpense)
    {
        for(Expense E : expenses)
        {
            if(E.getTransactionID().equals(newExpense.getTransactionID()))
            {
                System.out.println("This transaction has already been logged");
                return;
            }
        }
        this.expenses.add(newExpense);
    }
    public List<User> getUsers()
    {
        return this.users;
    }
    public List<Expense> getExpenses()
    {
        return this.expenses;
    }
    @Override public String toString()
    {
        return "Group{groupID='"+this.groupID+"',groupName='"+this.groupName+"',Users='"+this.users+"' ,Expenses = '"+this.expenses+"'}";       //in this two string function, when we write users equal to this.users, Java automatically loops through all the users in the list and prints it automatically. We don't have to do anything.
    }
}
