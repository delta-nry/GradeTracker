// This class consists of an array which contains the users classes

public class Manager {

    private Course[] courseList;
   	private int lastItem;
    // Constructor that creates an array of a certain size which
    // contains courses
    /////////////////////////////////////////////////////
    // For now it constructs a generic course; later on we want
    // this class to have a createCourse method and remove the
    // constructor
    public Manager() {
        this.courseList = new Course[1];
    }
    // Adds the passed in Course to the list
	public void addItem(Course newItem) {
		if (lastItem > courseList.length)
			this.increaseArraySize();
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
    	/*
    	String s = "";
    	for (int i = 0; i < courseList.length; i++) {
    		s += "\n";
        	s += courseList[i].getName();
    	}
    	*/
    	String s = courseList[0].getName();
        return s;
    }
}
