package com.example.finalproject;

public class Q5Choices extends Choices implements Results {
    @Override
    public String choice1() {
        q1Ca = "The process of binding a method call to its implementation at compile time";
        return q1Ca;
    }
    @Override
    public String choice2() {
        q1Cb = "The process of selecting which overloaded method to call at runtime";
        return q1Cb;
    }
    @Override
    public String choice3() {
        q1Cc = "The mechanism by which a subclass can call methods of its superclass";
        return q1Cc;
    }
    @Override
    public String choice4() {
        q1Cd = "The runtime mechanism by which a method call is resolved to the object's actual class method";
        return q1Cd;
    }
}