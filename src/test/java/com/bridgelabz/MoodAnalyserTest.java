package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

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
}