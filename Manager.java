// This class contains an ArrayList which contains the users classes

import java.util.List;
import java.util.ArrayList;

public class Manager {

    private List<Course> courseList = new ArrayList<Course>();
    private String name;
    // Constructor that creates an array which contains courses
    public Manager() {
        this.name = "Manager";
    }
    // Returns the assigned description
    public String getName() {
        return name;
    }
    // Gets a course based on a passed in value
    public Course getCourse(int courseIndexNumber) {
        return courseList.get(courseIndexNumber);
    }
    /*  Displays names of courses corresponding to their index values
     *  in courseList. Each name is shown as "[i]. [courseName]", with
     *  each course separated by newlines.
     */
    public String getCourseNames() {
        // Maybe use an iterator to replace i in the future
        String s = "";
        for (int i = 0; i < courseList.size(); i++) {
            s += "\n";
            s += i + ". " + courseList.get(i);
            // Do not add an extra newline to the last printed
            // courseList element
            if (i != courseList.size() - 1) {
                s += "\n";
            }
        }
        return s;
    }
    // Gets the size of the courseList array
    public int getCourseListSize() {
        return courseList.size();
    }
    // Adds the passed in Course to the end of courseList
    public void addCourse(Course newItem) {
        courseList.add(newItem);
    }
    // Deletes course in the last index number of courseList.
    public void deleteLastCourse() {
        if (courseList.size() >= 1) {
            courseList.remove(courseList.size() - 1);
        }
        else {
            System.out.println("\n" + "There are no courses to delete.");
        }
    }
}
