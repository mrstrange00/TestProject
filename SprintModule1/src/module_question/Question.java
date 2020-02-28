package module_question;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Question {
	BigInteger questionId;
	String questionTitle;
	int questionAnswer;
	BigDecimal questionMarks;
	int chosenAnswer;
	BigDecimal markScored;
	String [] QuestionOptions;

	public BigInteger getQuestionId() {
		return questionId;
	}
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public BigDecimal getMarkScored() {
		return markScored;
	}
	public void setMarkScored(BigDecimal markScored) {
		this.markScored = markScored;
	}
	public String[] getQuestionOptions() {
		return QuestionOptions;
	}
	public void setQuestionOptions(String[] questionOptions) {
		QuestionOptions = questionOptions;
	}
	
	
}
