package com.example.finalproject;

public class Check extends Questions{
int counter;
boolean checkAnswer(String answer) {

    if (counter == 0) {
        if (answer.equals("")) {
            return true;
        } else {
            return false;
        }
    }
    return false;
}
}
