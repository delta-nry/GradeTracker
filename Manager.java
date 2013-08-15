// This class contains an array which contains the users classes

public class Manager {

    private Course[] courseList;
   	private int lastItem;
    // Constructor that creates an array of a certain size Which contains courses
    public Manager(int size) {
        this.courseList = new Course[size];
    }
    // Adds the passed in Course to the list
	public void addItem(Course newItem) {
		if (lastItem > courseList.length)
			this.increaseArraySize();
		courseList[lastItem++] = newItem;
	}
	// Increases the array size by one whenever called, to prevent NullPointerExceptions 
	public void increaseArraySize() {
		Course[] temp = new Course[courseList.length+1];
		for (int i = 0; i < courseList.length; i++) {
			temp[i] = courseList[i];
		}
		courseList = temp;
	}
    // Displays name of course corresponding to its index value in the courseList array
    public String getCourseName(int i) {
        String string = courseList[i].getName();
        return string;
    }
}
