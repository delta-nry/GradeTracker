/*
*	Abstract implementation of the Grade object.
*	This allows for multiple types of Grades to be implemented,
*	so that the user can have a more accurate projection of their
*	final mark when requested.
*	Currently, the following types are implemented:
*	- Assignment
*	- Quiz
*	- Test
*	- Lab
*	- Participation
*	- Essay
*/
public abstract class Grade {
	
	private String name;
	private double worth;
	private double currMark;
	private int myScore;
	private int totalScore;
	
	public abstract String getType();
	// Sets name to passed in name
	public void setName(String newName) {
			this.name = newName;
	}
	// Returns the name of this Grade
	public String getName() {
			return name;
	}
	// Sets the worth of this grade towards overall mark, provided it is greater than 0 and less than 1
	public void setWorth(double newWorth) {
		if (newWorth > 0.0 && newWorth < 1.0) 
			this.worth = newWorth;
	} 
	// Returns worth of overall mark
	public double getWorth() {
		return worth;
	}
	// Sets current mark to passed in mark, provided it is greater than 0
	public void setCurrMark(double theMark) {
		if (theMark > 0.0) 
			this.currMark = theMark;
	}
	// Returns overall mark
	public double getCurrMark() {
		return currMark;
	}
	// Given my score and total score, calculates current mark
	public void calculateCurrMark() {
		double temp = (double)myScore/(double)totalScore;
		temp *= 100;
		this.currMark = temp;
	}
	// Sets my score only if total score is more than 0 and new score is greater than 0
	public void setMyScore(int newScore) {
		if (totalScore != 0 && newScore > 0) {
			this.myScore = newScore;
			this.calculateCurrMark();
		}
	}
	// Returns my score
	public int getMyScore() {
		return myScore;
	}
	// Sets total score, provided it is greater than 0
	public void setTotalScore(int maxScore) {
		if (maxScore > 0)
			this.totalScore = maxScore;
	}
	// Returns total score of Grade
	public int getTotalScore() {
		return totalScore;
	}
	
}
