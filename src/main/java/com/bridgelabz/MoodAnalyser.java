package com.bridgelabz;
public class MoodAnalyser {
    String message;
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public  String analyseMood() throws MoodAnalysisException {
        try {
            if (message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisException.EnumExceptionType.EMPTY_MESSAGE,"Please enter valid mood");
            }

            if (message.contains("sad")) {
                return "Sad";
            }
            return "Happy";
        }
        catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.EnumExceptionType.NULL_MESSAGE,"fPlease enter valid mood");
        }

    }
}