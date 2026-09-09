package com.splitwise;
import com.splitwise.model.Group;
import com.splitwise.model.User;

public class Main {
    public static void main(String[] args) {
        User U1 = new User("Aditya");
        User U2 = new User("u2");
        User U3 = new User("u3");
        Group g3 = new Group("pliers");
        System.out.println(U1.toString());
        System.out.println(U2.toString());
        System.out.println(U3.toString());
        g3.addMember(U3);
        g3.addMember(U1);
        g3.addMember(U2);
        g3.addMember(U1);                               //testing the ad-members function in the group class works as I try to input the user one twice
        System.out.println(g3);
    }
}
