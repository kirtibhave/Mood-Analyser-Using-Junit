package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserUsingReflection {
    //Reflection For Default Constructor
    public static MoodAnalyser  createMoodAnalyzerDefault(){
        try {
            Constructor constructor = Class.forName("com.bridgelab.junit.MoodAnalyzer").getConstructor();
            MoodAnalyser moodAnalyzer = (MoodAnalyser) constructor.newInstance();
            return  moodAnalyzer;
        } catch (ClassNotFoundException | NoSuchMethodException e ) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  static  Constructor<?> getConstructor(String className,Class constructor) throws MoodAnalysisException {
        try {
            Class<?> moodAnalyzer = Class.forName(className);
            return moodAnalyzer.getConstructor(constructor);
        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisException(MoodAnalysisException.EnumExceptionType.CLASS_NOT_FOUND, e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisException(MoodAnalysisException.EnumExceptionType.NO_SUCH_METHOD, e.getMessage());
        }
    }
    public static MoodAnalyser createMoodAnalyzer(String message) {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.bridgelabz.MoodAnalyzer");
            Constructor<?> moodConstructor = null;
            moodConstructor = moodAnalyserClass.getConstructor(String.class);
            moodConstructor.newInstance(message);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static MoodAnalyser createMoodAnalyser(String className) {
        try {
            Class<?> moodAnalyserClass = Class.forName(className);
            Constructor<?> moodConstructor = null;
            moodConstructor = moodAnalyserClass.getConstructor();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisException(MoodAnalysisException.EnumExceptionType.CLASS_NOT_FOUND,e.getMessage());
        }
        return null;
    }
}






