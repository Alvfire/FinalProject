package com.example.finalproject;

public class Q3Choices extends Choices implements Results {
    @Override
    public String choice1() {
        q1Ca = " A subclass implementing an interface";
        return q1Ca;
    }
    @Override
    public String choice2() {
        q1Cb = "A superclass calling a private method of a subclass";
        return q1Cb;
    }
    @Override
    public String choice3() {
        q1Cc = "A single method name having different meanings depending on the context";
        return q1Cc;
    }
    @Override
    public String choice4() {
        q1Cd = "A subclass inheriting private methods from its superclass";
        return q1Cd;
    }
}