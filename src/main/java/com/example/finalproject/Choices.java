package com.example.finalproject;

public class Choices extends Questions implements Results{
    String q1Ca;
    String q1Cb;
    String q1Cc;
    String q1Cd;
    String q2Ca;
    String q2Cb;

    public String choice1() {
        q1Ca = "A class that has more specific behavior than its subclasses";
        return q1Ca;
    }

    public String choice2() {
        q1Cb = "A class that is at the top of the inheritance hierarchy";
        return q1Cb;
    }

    public String choice3() {
        q1Cc = "A class that cannot be inherited by any other class";
        return q1Cc;
    }

    public String choice4() {
        q1Cd = "A class that only contains private methods";
        return q1Cd;
    }
    public String TChoice() {
        q2Ca = "True";
        return q2Ca;
    }
    public String FChoice() {
        q2Cb = "False";
        return q2Cb;
    }
    @Override
    public String toString() {

        return q1Ca + "\n" + q1Cb + "\n" + q1Cc + "\n" + q1Cd;
    }
}