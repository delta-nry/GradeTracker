public class Participation extends AbGrade {
	/*// Constructor for a Participation, which only requires a name and worth
	public Assignment(String theName, double myWorth) {
		this.name = theName;
		this.worth = myWorth;
		this.currMark = 0.0;
		this.myScore = 0;
		this.totalScore = 0;
	}
	// Constructor for a Participation, which requires a name, a worth, and mark
	public Assignment(String theName, double myWorth, double myMark) {
		this.name = theName;
		this.worth = myWorth;
		this.currMark = myMark;
		this.myScore = 0;
		this.totalScore = 0;
	}*/
	// Returns the type of this Grade extension, for accurate projected marks
	public String getType() {
		return "Participation";
	}	

}