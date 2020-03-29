package com.bridgelabz;

public class MoodAnalyser {

    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad")) {
                return "Sad";
            }
                return "Happy";
            } catch (NullPointerException e) {
                e.printStackTrace();
                return  "Happy";
            }
    }
}
