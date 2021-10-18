package com.bridgelabz.moodanalyserproblem;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessageWhenProperShouldReturnSad() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
		String actualResult = moodanalyser.analyseMood();
		Assert.assertEquals("Sad", actualResult);
	}
}
