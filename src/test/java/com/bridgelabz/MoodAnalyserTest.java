package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    //1.1
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalysis = new MoodAnalyser();
        String mood = moodAnalysis.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    //1.2
    @Test
    public void givenMood_whenAny_shouldReturnHappy()  {
        MoodAnalyser moodAnalysis = new MoodAnalyser();
        String mood = moodAnalysis.analyseMood("I am in any Mood");
        Assert.assertEquals("Happy", mood);
    }
}
