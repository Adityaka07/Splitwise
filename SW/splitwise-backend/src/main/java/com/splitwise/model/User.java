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
}
