public class Course {

	private String name;
	private int creditContribution;
	private Grade[] marks;
	private double overallMark;
	private double currMark;
	private double projectedMark;
	private int nextItem;
	/*
	 * Initializes the course, given:
	 * a course name
	 * amount of items you want in course
	 * the credit worth
	 */
	public Course(String theName, int size, int credits) {
		this.name = theName;
		this.creditContribution = credits;
		this.marks = new Grade[size];
		this.overallMark = 0.0;
		this.currMark = 0.0;
		this.projectedMark = 0.0;
		this.nextItem = 0;
	}
	/*
	 *	Called on whenever you update one of the grades within
	 *	the course's array of marks
	 *	It resets the current mark to be 0.0, and gets the total
	 *	percent of the course that has been defined to have been
	 *	covered. This is determined by checking each item to see if 
	 *	it has a current grade attached to it; if it does, add that
	 *	mark's worth to a temporary double.
	 *	After the array has been searched, goes through the array again
	 *	and adds a value resulting from the following formula to the
	 *	current mark:
	 *		( mark's worth / overall worth ) * mark's current mark
	 *	If an item has no given grade, it will simply add 0.0 to the 
	 *	current mark.
	 *	Once this loop completes, the method is finished.
	 */
	public void calculateCurrMark() {
		this.currMark = 0.0;
		double totalObtainedWorth = 0;
		for (int i = 0; i < nextItem; i++) {
			if (marks[i].getCurrMark() != 0.0) 
				totalObtainedWorth += marks[i].getWorth();
		}
		double tempMark = 0.0;
		for (int i = 0; i < nextItem; i++) {
			tempMark = marks[i].getCurrMark();
			this.currMark += (marks[i].getWorth()/totalObtainedWorth)
							 *tempMark;
		}
		
	}
	// Returns the current mark
	public double getCurrMark() {
		return currMark;
	}
	/*
	 *	This method is designed to calculate the overall mark
	 *	of the course. It begins by setting the overall mark
	 *	to 0.0, and from there it cycles through the array, adding
	 *	the product of the mark's worth and the mark's current mark
	 *	to the overall mark.
	 */
	public void calculateOverallMark() {
		this.overallMark = 0.0;
		for (int i = 0; i < nextItem; i++) { 
			overallMark += marks[i].getWorth()*marks[i].getCurrMark();
		}
	}
	// Returns the overall mark
	public double getOverallMark() {
		return overallMark;
	}
	// Sets the name of the course to the passed in name
	public void setName(String newName) {
		this.name = newName;
	}
	// Returns the name of the course
	public String getName() {
		return name;
	}
	/*
	 *	Checks first to see if the next slot "available"
	 *	in the array is within the scope of the array, increases
	 *	size of array if this is not the case
	 *	It then adds the item to the next available slot in the array
	 *	and increments the nextItem reference to point at the next 
	 *	available array spot.
	 *	Next, it checks to see if the item that was added has a current
	 *	grade attached to it. If it does, recalculate the current mark
	 *	and overall marks for the course. 
	 */
	public void addItem(Grade newItem) {
		if (nextItem > marks.length)
			this.increaseArraySize();
		marks[nextItem++] = newItem;
		if (newItem.getCurrMark() != 0.0) {
			this.calculateCurrMark();
			this.calculateOverallMark();
		}
	}
	/*
	 * Increases the array size by one whenever called
	 * to prevent NullPointerExceptions 
	 */
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
	/*
	 *	Searches array for passed in Grade, and when found,
	 *	shuffles it to the end of the array.
	 *	Afterwards, if the item was found then the last item in the
	 *	array (which is now the item we wanted to delete) is nullified
	 *	and nextItem is decremented by 1.*
	 */
	public void deleteItem(Grade toDel) {
		Grade temp = null;
		boolean isPresent = false;
		for (int i = 0; i < nextItem; i++) {
			if (marks[i].getName().equals(toDel.getName()) 
				&& i != nextItem-1) {
				isPresent = true;
				temp = marks[i];
				marks[i] = marks[i+1];
				marks[i+1] = temp;				
			}
		}
		if (isPresent) {
			marks[--nextItem] = null;
			System.out.println("Deleted the following Grade" + toDel);
		}
	}
	/*
	 *	Using a passed in String with the item's name, searches
	 *	the array for the item with the corresponding name
	 *	and when found, returns it
	 *	If the item is not found, prints a message stating
	 *	that this case has been reached and returns null
	 */
	public Grade findGrade(String name) {
		for (int i = 0; i < nextItem; i++) {
			if (marks[i].getName().equals(name)) {
				return marks[i];
			}
		}
		System.out.println(name + " not found.");
		return null;
	}
	// Shows all items in the list
	public String toString() {
		String s = "";
		for (int i = 0; i < nextItem; i++) {
			s += name + "\n";
			s += "Credits: " + creditContribution + "\n";
			s += "Current Mark: " + currMark + "\n";
		}
		return s;
	}
}