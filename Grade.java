public class Grade {

    private String name;
    private double currMark;
    private double worth;
    private int myScore;
    private int totalScore;
    /*
     * Constructor for the Grade, which only requires a description 
     * and worth to course
     */
    public Grade(String theName, double theWorth, int totalScore, int myScore) {
        this.name = theName;
        this.worth = theWorth;
        this.currMark = 0.0;
        this.myScore = myScore;
        this.totalScore = totalScore;
    }
    // Re-assigns a description for the Grade
    public void setName(String newName) {
        this.name = newName;
    }   
    // Returns the assigned description
    public String getName() {
        return name;
    }
    // Re-assigns the worth of this Grade towards the course mark
    public void setWorth(double newWorth) {
        this.worth = newWorth;
    }
    // Returns assigned worth towards course mark
    public double getWorth() {
        return worth;
    }
    // Assigns a percentage-based mark to the Grade
    public void setCurrMark(double theMark) {
        this.currMark = theMark;
    }
    // Returns current mark
    public double getCurrMark() {
        return currMark;
    }
    /*  Calculates current mark, if your score and total score are 
     *  defined.
     */
    public void calculateCurrMark() {
        double temp = (double)myScore * (double)totalScore;
        if (temp > 1000.0)
            this.currMark = temp/100;
        else
            this.currMark = temp;
    }
    // Assigns the score you got on the marked item
    public void setMyScore(int newScore) {
        this.myScore = newScore;
        if (totalScore != 0)
            this.calculateCurrMark();
    }   
    // Returns the score you got on the marked item
    public int getMyScore() {
        return myScore;
    }
    // Assigns the maximum score you can achieve on this item
    public void setTotalScore(int maxScore) {
        this.totalScore = maxScore;
    }
    // Returns the total score possible on the assignment
    public int getTotalScore() {
        return totalScore;
    }
    // Concatenates any non-zero values into a String to be returned
    public String toString() {
        String s = name + "\n";
        if (myScore != 0) 
            s += "Your score on this item: " + myScore + "\n";
        if (totalScore != 0) 
            s += "Total possible score on this item: " + totalScore + "\n";
        if (currMark != 0.0)
            s += "Percentage aquired on this item (Your score/Total score): " + currMark + "%\n";
        s += "This item's worth to your final mark for this course: " + worth + "%\n";
        return s;
    }   
}
