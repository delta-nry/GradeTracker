// This class contains an array which contains the users classes
public class Manager {

    private Course[] courseList;
    private int nextItem;
    private String name;
    // Constructor that creates an array which contains courses
    public Manager() {
        this.courseList = new Course[1];
        this.nextItem = 0;
        this.name = "Manager";
    }
    // Returns the assigned description
    public String getName() {
        return name;
    }
    // Gets a course based on a passed in value
    public Course getCourse(int courseIndexNumber) {
        return courseList[courseIndexNumber];
    }
    /*  Displays names of courses corresponding to their index values
     *  in the courseList array. Each name is shown as
     *  "[i]. [courseName]", with each course separated by newlines.
     */
    public String getCourseNames() {
        String s = "";
        for (int i = 0; i < courseList.length; i++) {
            s += "\n";
            s += i + ". " + courseList[i].getName();
        }
        return s;
    }
    // Gets the size of the courseList array
    public int getCourseListSize() {
        return courseList.length;
    }
    // Adds the passed in Course to the list
    public void addCourse(Course newItem) {
    // NOTE: Can the array courseList.length == 0 even exist?
    // If not, delete the below "if (courseList.length == 0) {...}"
    // condition
        // Check for a condition with an empty
        // courseList[] array and then increment the array size
        // to prevent ArrayIndexOutOfBoundsException
        if (courseList.length == 0) {
            // reset nextItem to sync it with the array size
            nextItem = 0;
            increaseArraySize();
            //courseList[nextItem++] = newItem;
            //return;
        }
        if (nextItem >= courseList.length) {
            increaseArraySize();
        }
        courseList[nextItem++] = newItem;
    }
    // Deletes course from the list according to its index number
    // NOTE: Since a list is used, this method currently only deletes
    // the greatest course in the list as well as decreasing the list
    // size by 1.
    public void deleteLastCourse() {
        if (courseList.length > 1) {
            // At this point, nextItem and courseList.length should
            // be equal before the command below
            courseList[--nextItem] = null;
            decreaseArraySize();
        }
        else {
            System.out.println("\n" + "There are no courses to delete.");
        }
    }
    /*  Increases the array size by one whenever called, to prevent 
     *  NullPointerExceptions.
     */
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
        }
        // Clear the array and create a new one if it's length is 
        // equal than 1 (has only one item left inside of it)
        else if (courseList.length == 1) {
            // This deletes the array entirely since its single value
            // is set to null
            courseList[0] = null;
            this.courseList = new Course[1];
            this.nextItem = 0;
        }
        else {
            System.out.println("\n" + "Warning: Attempted to decrease an array with a length less than 1. Aborted decreasing the size of this array");
        }
    }
}
