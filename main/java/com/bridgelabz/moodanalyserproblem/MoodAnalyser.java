package com.bridgelabz.moodanalyserproblem;

/**
 * Purpose - “I am in Sad Mood” message Should Return SAD
 *
 * 
 */

public class MoodAnalyser {

	public static String message;

	// Constructor
	public MoodAnalyser(String message) {
		MoodAnalyser.message = message;
		analyseMood();
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		MoodAnalyser.message = message;
	}
	public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
