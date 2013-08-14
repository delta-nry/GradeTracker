public class Course {

	private String name;
	private int creditContribution;
	private Grade[] marks;
	private double overallMark;
	private double currMark;
	private double projectedMark;
	private int lastItem;
	// Initializes the course, given a course name, amount of items you want in course, and the credit worth
	public Course(String theName, int size, int credits) {
		this.name = theName;
		this.creditContribution = credits;
		this.marks = new Grade[size];
		this.overallMark = 0.0;
		this.currMark = 0.0;
		this.projectedMark = 0.0;
		this.lastItem = 0;
	}
	// Adds the passed in Grade to the list
	public void addItem(Grade newItem) {
		if (lastItem > marks.size)
			this.increaseArraySize();
		marks[lastItem++] = newItem;
	}
	// Increases the array size by one whenever called, to prevent NullPointerExceptions 
	public void increaseArraySize() {
		Grade[] temp = new Grade[marks.length+1];
		for (int i = 0; i < marks.length; i++) {
			temp[i] = marks[i];
		}
		marks = temp;
	}

}