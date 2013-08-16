// This class consists of an array which contains the users classes

public class Manager {

    private Course[] courseList;
   	private int lastItem;
    private String name;
    // Constructor that creates an array which contains courses
    public Manager() {
        this.courseList = new Course[0];
        this.lastItem = 0;
        this.name = "Manager";
    }
    // Returns the assigned description
    public String getName() {
        return name;
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
    // Decreases the array size by one whenever called
    public void decreaseArraySize() {
        // Only decrease the array size if it is greater than one
        if (courseList.length > 1) {
            Course[] temp = new Course[courseList.length-1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = courseList[i];
            }
            courseList = temp;
            // NOTE: Is this safe or is there a better way which doesn't require this?
            --lastItem;
        }
    }
    // Displays name of course corresponding to its index value in the
    // courseList array
    public String getCourseNames() {
    	String s = "";
    	for (int i = 0; i < courseList.length; i++) {
        	s += "\n";
        	s += i + ". " + courseList[i].getName();
    	}
        return s;
    }
    // Deletes course from the list according to its index number
    // NOTE: Since a list is used, this method currently only deletes
    // the greatest course in the list as well as decreasing the list
    // size by 1
    public void deleteLastCourse() {
        if (courseList.length > 1) {
            int toDelete = courseList.length - 1;
            courseList[toDelete] = null;
            decreaseArraySize();
        }
        // Clear the array and create a new one if it's length is 
        // equal than 1 (has only one item left inside of it)
        else if (courseList.length == 1) {
            // This deletes the array entirely since its single value
            // is set to null
            courseList[0] = null;
            this.courseList = new Course[0];
            this.lastItem = 0;
        }
        else {
            System.out.println("\n" + "There are no courses to delete.");
        }
    }
    // Gets a course based on a passed in value
    public Course getCourse(int courseIndexNumber) {
        return courseList[courseIndexNumber];
    }
}
