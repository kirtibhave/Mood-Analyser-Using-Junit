package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserTest {

    //1.1
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalysis = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalysis.analyseMood();
        Assert.assertEquals("Sad", mood);
    }

    //1.2
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalysis = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalysis.analyseMood();
        Assert.assertEquals("Happy", mood);
    }

    //2.1
    @Test
    public void givenNullMessage_ShouldReturnHappy()  {
        try {
            MoodAnalyser moodAnalysis = new MoodAnalyser("NULL");
            String mood = moodAnalysis.analyseMood();
            Assert.assertEquals("Happy",mood);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //3.1
    @Test
    public void givenNullMessage_ShouldThrowException() throws MoodAnalysisException {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy", mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //3.2
    @Test
    public void givenMood_whenNull_shouldReturnCustomMessage() {
        try {
            MoodAnalyser moodAnalysis = new MoodAnalyser("");
            String mood = moodAnalysis.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.EnumExceptionType.EMPTY_MESSAGE, e.type);
        }
    }

    //3.2
    @Test
    public void givenMood_whenEmpty_shouldReturnCustomMessage() {
        try {
            MoodAnalyser moodAnalysis = new MoodAnalyser(null);
            String mood = moodAnalysis.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.EnumExceptionType.NULL_MESSAGE, e.type);
        }
    }

    //4.1 for default constructor
    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObject() {
        try {
            Constructor<?> constructor = Class.forName("com.bridgelabz.MoodAnalyser").getConstructor(String.class);
            Object object = constructor.newInstance("I am in happy mood");
            MoodAnalyser moodAnalyser = (MoodAnalyser) object;
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy", mood);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyserClass_EqualsMethod_toCheckTwoObjectsAreEqual() {
        try {
            MoodAnalyser moodAnalyzer = MoodAnalyserUsingReflection.createMoodAnalyzerDefault();
            Assert.assertEquals(new MoodAnalyser(), moodAnalyzer);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMoodAnalyserClass_When_ClassNameIsImproper() {
        try {
            Constructor<?> moodAnalyzer = new MoodAnalyserUsingReflection().getConstructor("com.bridgenbflabz.MoodAnalyser", String.class);

        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.EnumExceptionType.CLASS_NOT_FOUND, e.type);

        }
    }

    @Test
    public void givenMoodAnalyserClass_WhenConstructorIsNotProper(){
        try {
            Constructor<?> moodAnalyser = new MoodAnalyserUsingReflection().getConstructor("com.bridgelabz.MoodAnalyser", int.class);

        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.EnumExceptionType.NO_SUCH_METHOD, e.type);
        }
    }
}

