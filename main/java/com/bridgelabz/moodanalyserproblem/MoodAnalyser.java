package com.bridgelabz.moodanalyserproblem;

/**
 * Purpose - “I am in Sad Mood” message Should Return SAD
 *
 *
 */

public class MoodAnalyser {
	public String message;

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

	public String analyseMood() {
		if (message.toLowerCase().contains("sad")) {
			return "Sad";
		}
		return "Happy";
	}

}
