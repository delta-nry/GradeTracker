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
   	// Re-assigns a description for the Course
	public void setName(String newName) {
		this.name = newName;
	}	
	// Returns the assigned description
	public String getName() {
		return name;
	}
	// Adds the passed in Grade to the list
	public void addItem(Grade newItem) {
		if (lastItem > marks.length)
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
	// Returns the credit contribution 
	public int getCreditContribution() {
		return creditContribution;
	}
	public void deleteItem(Grade toDel) {
		Grade temp = null;
		boolean isPresent = false;
		for (int i = 0; i < lastItem; i++) {
			if (marks[i].getName().equals(toDel.getName()) && i != lastItem-1) {
				isPresent = true;
				temp = marks[i];
				marks[i] = marks[i+1];
				marks[i+1] = temp;				
			}
		}
		if (isPresent) {
			marks[--lastItem] = null;
			System.out.println("Deleted the following Grade" + toDel);
		}
	}
	// Shows all items in the list
	public String toString() {
		String s = "";
		for (int i = 0; i < lastItem; i++) {
			s += name + "\n";
			s += "Credits: " + creditContribution + "\n";
			s += "Current Mark: " + currMark + "\n";
		}
		return s;
	}
}
