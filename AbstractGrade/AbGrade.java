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
 *	These types are to be implemented:
 *	- Other
 */
public abstract class AbGrade {
	
	private String name;
	private double worth;
	private double currMark;
	private int myScore;
	private int totalScore;
	
	public abstract String getType();
	public void setName(String newName) {
			this.name = newName;
	}
	
	public String getName() {
			return name;
	}
	
	public void setWorth(double newWorth) {
		this.worth = newWorth;
	} 
	public double getWorth() {
		return worth;
	}
	
	public void setCurrMark(double theMark) {
		this.currMark = theMark;
	}
	public double getCurrMark() {
		return currMark;
	}
	public void calculateCurrMark() {
		double temp = (double)myScore/(double)totalScore;
		temp *= 100;
		this.currMark = temp;
	}
	public void setMyScore(int newScore) {
		if (totalScore != 0) {
			this.myScore = newScore;
			this.calculateCurrMark();
		}
	}
	public int getMyScore() {
		return myScore;
	}
	public void setTotalScore(int maxScore) {
		this.totalScore = maxScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	
}