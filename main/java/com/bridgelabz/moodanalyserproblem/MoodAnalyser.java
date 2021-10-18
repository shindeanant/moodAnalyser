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
		this.message = message;
		analyseMood();
	}

	// Getter
	public String getMessage() {
		return message;
	}

	// Setter
	public void setMessage(String message) {
		this.message = message;
	}

	public static String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "Sad";
			} else {
				return "Happy";
			}
		} catch (NullPointerException e) {
			return "Exception Handled";
		}
	}
}
