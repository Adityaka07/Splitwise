package com.splitwise.model;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class Group {
    private String groupID;
    private String groupName;
    private List<User> users;                           //this is the place which is a list in which we will store all the users object, the data type of this list is the user object, so we can store the whole object in this, not only the user IDs or stuff

    public Group(String groupID,String groupName)
    {
        this.groupID = UUID.randomUUID().toString();
        this.groupName = groupName;
        this.users = new ArrayList<>();
    }

    public void addMembers(User newUser)
    {
        for(User U : users)
        {
            if(U.getUserID.equals(newUser.getUserID()))
            {
                System.out.println("this book already exists");
                return;
            }
            this.users.add(newUser);
        }
    }
    public List<User> getUsers()
    {
        return this.users;
    }
}
