// This class consists of a text-based menu which allows users to
// manage their courses and grades

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

	private Manager theManager;
	// Constructor creating one Manager instance with a size integer
	// value passed in to create a new course
	public Menu() {
		this.theManager = new Manager();
	}
	// Adds the passed in Course to the list in the Manager object
	public void addItem(Course newItem) {
		theManager.addCourse(newItem);
	}
	public void managerMenu() {
		System.out.println("\n" + "ManagerMenu:");
		Scanner userInput = new Scanner(System.in);
		boolean userHasQuit = false;
		// Keep looping until user quits the menu
		while(!userHasQuit) {
			// This could be unsafe
			// Keep looping until valid input is received
			boolean validInput = false;
			while(!validInput) {
				try {
					System.out.println("\n" + "Enter 1 to get course names,");
					System.out.println("Enter 2 to add a new course,");
					System.out.println("Enter 9 to quit:");
					System.out.printf(" > ");
					int choice = userInput.nextInt();
					validInput = true;
					switch (choice) {
					case 1:
						System.out.println(theManager.getCourseNames());
						break;
					case 2:
					    Course newCourse = new Course("newCourse", 10, 4);
					    theManager.increaseArraySize();
						this.addItem(newCourse);
						break;
					case 9:
					    userHasQuit = true;
						break;
					default:
						System.out.println("\n" + "Couldn't understand request; try again");
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("\n" + "Couldn't understand request; try again");
					// Flushes garbage input to prevent infinite looping
					userInput.nextLine();
				}
			}
		}
	}
}