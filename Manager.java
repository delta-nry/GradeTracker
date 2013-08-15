// This class consists of an array which contains the users classes

public class Manager {

    private Course[] courseList;
   	private int lastItem;
    // Constructor that creates an array which contains courses
    public Manager() {
        this.courseList = new Course[0];
        this.lastItem = 0;
    }
    // Adds the passed in Course to the list
	public void addCourse(Course newItem) {
		if (lastItem > courseList.length) {
			increaseArraySize();
		}
		courseList[lastItem++] = newItem;
	}
	// Increases the array size by one whenever called, to prevent
	// NullPointerExceptions 
	public void increaseArraySize() {
		Course[] temp = new Course[courseList.length+1];
		for (int i = 0; i < courseList.length; i++) {
			temp[i] = courseList[i];
		}
		courseList = temp;
	}
    // Displays name of course corresponding to its index value in the
    // courseList array
    public String getCourseNames() {
    	String s = "";
    	for (int i = 0; i < courseList.length; i++) {
        	s += "\n";
        	s += courseList[i].getName();
    	}
        return s;
    }
}
