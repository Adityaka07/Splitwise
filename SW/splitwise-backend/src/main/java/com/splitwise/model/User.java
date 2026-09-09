package com.splitwise.model;
import java.util.UUID;

public class User {
    private String name;
    private String userID;                           //did not add the user ID string earlier, but Gemini told me so because the names can be same, which I could have thought if I spent more time on ideation
 
    public User(String name)                        //made a mistake here too, as the constructor in Java do not have a return type, not even void or int---also did not add a access modifier to the constructor
    {
        this.name = name;
        this.userID = UUID.randomUUID().toString();
    }

    public String getName() 
    {
        return this.name;
    }
    public String getUserID() 
    {
        return this.userID;
    }
    @Override public String toString()                                          //used override your because there is atoString() in the class as well as every class, we make in the project is an inherited class to a class called object which has a tostring() function as well, so by default, when we call the toString() function the inherited from the object class. function is called instead of the function in the user class. So we have to override it
    {
        return "User{userId='"+this.userID+"',name='"+this.name+"'}";           //merge this function in user class so we can output a clean string whenever we need--when we just try to print the whole object, it just prints the memory address of the object--more in the blog
    }
}
