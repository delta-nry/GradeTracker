import java.util.List;
import java.util.ArrayList;

public class Course {

    private String name;
    private int creditContribution;
    private List<Grade> marksList = new ArrayList<Grade>();
    private double overallMark;
    private double currMark;
    private double projectedMark;
    /*
     *  Initializes the course, given:
     *  a course name
     *  amount of items you want in course
     *  the credit worth.
     */
    public Course(String theName, int size, int credits) {
        this.name = theName;
        this.creditContribution = credits;
        this.overallMark = 0.0;
        this.currMark = 0.0;
        this.projectedMark = 0.0;
    }
    // Sets the name of the course to the passed in name
    public void setName(String newName) {
        this.name = newName;
    }
    // Returns the name of the course
    public String getName() {
        return name;
    }
    // Returns the credit contribution 
    public int getCreditContribution() {
        return creditContribution;
    }
    /*
     *  Displays names of Grades corresponding to their index 'i'
     *  values in the marksList. Each name is shown as
     *  "[i]. [gradeName]", with each Grade separated by newlines.
     */
    public String getGradeNames() {
        String s = "";
        for (int i = 0; i < marksList.size(); i++) {
            s += "\n";
            s += i + ". " + marksList.get(i).getName();
        }
        return s;
    }
    /*
     *  Called on whenever you update one of the grades within
     *  the course's marksList
     *  It resets the current mark to be 0.0, and gets the total
     *  percent of the course that has been defined to have been
     *  covered. This is determined by checking each item to see if 
     *  it has a current grade attached to it; if it does, add that
     *  mark's worth to a temporary double.
     *  After the list has been searched, goes through the list again
     *  and adds a value resulting from the following formula to the
     *  current mark:
     *      ( mark's worth / overall worth ) * mark's current mark
     *  If an item has no given grade, it will simply add 0.0 to the 
     *  current mark.
     *  Once this loop completes, the method is finished.
     */
    public void calculateCurrMark() {
        this.currMark = 0.0;
        double totalObtainedWorth = 0;
        for (int i = 0; i < marksList.size(); i++) {
            if (marksList.get(i).getCurrMark() != 0.0) 
                totalObtainedWorth += marksList.get(i).getWorth();
        }
        double tempMark = 0.0;
        for (int i = 0; i < marksList.size(); i++) {
            tempMark = marksList.get(i).getCurrMark();
            this.currMark += (marksList.get(i).getWorth()/totalObtainedWorth)
                             *tempMark;
        }
        
    }
    // Returns the current mark
    public double getCurrMark() {
        return currMark;
    }
    /*
     *  This method is designed to calculate the overall mark
     *  of the course. It begins by setting the overall mark
     *  to 0.0, and from there it cycles through the list, adding
     *  the product of the mark's worth and the mark's current mark
     *  to the overall mark.
     */
    public void calculateOverallMark() {
        this.overallMark = 0.0;
        for (int i = 0; i < marksList.size(); i++) { 
            overallMark += marksList.get(i).getWorth()*marksList.get(i).getCurrMark();
        }
    }
    // Returns the overall mark
    public double getOverallMark() {
        return overallMark;
    }
    /*
     *  Appends a new grade to the end of marksList.
     *  Next, it checks to see if the item that was added has a current
     *  grade attached to it. If it does, recalculate the current mark
     *  and overall marks for the course. 
     */
    public void addItem(Grade newItem) {
        marksList.add(newItem);
        if (newItem.getCurrMark() != 0.0) {
            this.calculateCurrMark();
            this.calculateOverallMark();
        }
    }
    /*
     *  Searches array for passed in Grade, and if found,
     *  removes it from the marksList. If not found, it indicates that
     *  no grades have been removed from the marksList.
     */
    public void deleteItem(Grade toDel) {
        if (marksList.contains(toDel)) {
            marksList.remove(toDel);
            System.out.println("\n" + "Deleted the " + toDel + "grade.");
        }
        else {
            System.out.println("\n" + "No grades were found with the name " + toDel + ".");
        }
    }
    /*
     *  Using a passed in String with the item's name, searches
     *  the marksList for the item with the corresponding name
     *  and when found, returns it.
     *  If the item is not found, prints a message stating
     *  that this case has been reached and returns null.
     */
    public Grade findGrade(String name) {
        for (int i = 0; i < marksList.size(); i++) {
            if (marksList.get(i).getName().equals(name)) {
                return marksList.get(i);
            }
        }
        System.out.println(name + " not found.");
        return null;
    }
    /*
     *  Writes course information into a string.
     */
    public String toString() {
        String s = "";
        s += "\n" + name + "\n";
        s += "Credits: " + creditContribution + "\n";
        s += "Current Mark: " + currMark;
        return s;
    }
}
