package com.kai.flashcard;

public class Note {
	
	private String prompt;
	private String answer;
	
	public Note(String _prompt, String _answer) {
		this.prompt = _prompt;
		this.answer = _answer;
	}
	
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
