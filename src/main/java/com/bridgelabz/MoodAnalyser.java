package com.bridgelabz;

public class MoodAnalyser {

    String message;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("happy"))
            return "Happy";
        else
            return "Sad";
    }
}