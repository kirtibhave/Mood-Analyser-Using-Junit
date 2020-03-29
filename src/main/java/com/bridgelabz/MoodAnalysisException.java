package com.bridgelabz;

public class MoodAnalysisException extends RuntimeException{
    public EnumExceptionType type;
    public enum EnumExceptionType {
        EMPTY_MESSAGE,NULL_MESSAGE,CLASS_NOT_FOUND,NO_SUCH_METHOD, NO_SUCH_FIELD, INVOCATION_ISSUE;
    }//EnumExceptionType type;
    public MoodAnalysisException(EnumExceptionType type,String message) {
        super(message);
        this.type=type;
    }

}

