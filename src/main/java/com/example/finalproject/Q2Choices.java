package com.example.finalproject;

public class Q2Choices extends Choices implements Results {
    @Override
    public String choice1() {
        q1Ca = "A subclass can override both static and final methods of its superclass";
        return q1Ca;
    }
    @Override
    public String choice2() {
        q1Cb = "Overridden methods must have the same name, return type, and parameters as the superclass method";
        return q1Cb;
    }
    @Override
    public String choice3() {
        q1Cc = "Overriding allows a subclass to hide the implementation of a superclass method";
        return q1Cc;
    }
    @Override
    public String choice4() {
        q1Cd = "The 'final' keyword is used to prevent a method from being overridden";
        return q1Cd;
    }
}