package org.miu.problem1;

public class ScoreCard {
	private String subjectName;
	private double subjectScore;

	public ScoreCard() {

	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public double getSubjectScore() {
		return subjectScore;
	}

	public void setSubjectScore(double subjectScore) {
		this.subjectScore = subjectScore;
	}

	@Override
	public String toString() {
		return subjectName + " " + subjectScore;
	}

	public boolean equals(Object obj){
		if(this==obj) return true;
		if(!(obj instanceof ScoreCard marketing)) return false;
		return marketing.getSubjectName().equals(this.getSubjectName()) &&
						marketing.getSubjectScore()==this.getSubjectScore();
	}
}