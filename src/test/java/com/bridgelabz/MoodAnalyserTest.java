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

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalysis = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalysis.analyseMood();
        Assert.assertEquals("Happy", mood);
    }
}