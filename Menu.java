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
    public void addCourse(Course newCourse) {
        theManager.addCourse(newCourse);
    }
    // Accesses the user's courses
    public void managerMenu() {
        Scanner userInput = new Scanner(System.in);
        boolean userHasQuit = false;
        // Keep looping until user quits the menu
        while(!userHasQuit) {
            // This could be unsafe
            // Keep looping until valid input is received
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("\n" + "----------");
                    System.out.println("\n" + "Menu for " + theManager.getName());
                    System.out.println("\n" + "Enter 1 to get the list of registered course names,");
                    System.out.println("Enter 2 to register a new course,");
                    System.out.println("Enter 3 to delete the last registered course,");
                    System.out.println("Enter 4 to manage a registered course,");
                    System.out.println("Enter 9 to quit:");
                    System.out.printf(" > ");
                    int choice = userInput.nextInt();
                    validInput = true;
                    switch (choice) {
                    case 1:
                        try {
                            // Check if no courses are registered
                            if (theManager.getCourseNames().isEmpty()) {
                                System.out.println("\n" + "No courses are registered; try adding a new one.");
                                break;
                            }
                            System.out.println(theManager.getCourseNames());
                        } catch (NullPointerException e) {
                            System.out.println("\n" + "No courses are availible; try adding a new one.");
                        }
                        break;
                    case 2:
                        // Flushes garbage input to prevent unintended actions
                        userInput.nextLine();
                        // Default Course name, size and credits are already listed
                        String inputName = "newCourse";
                        int inputSize = 10;
                        int inputCredits = 4;
                        boolean validName = false;
                        boolean validSize = false;
                        boolean validCredits = false;
                        while (!validName) {
                            try {
                                System.out.println("\n" + "Enter a course name:");
                                System.out.printf(" > ");
                                // Check if the name is empty
                                inputName = userInput.nextLine();
                                if (!inputName.isEmpty()) {
                                    validName = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\n" + "Invalid course name; try again.");
                                // Flushes garbage input to prevent unintended actions
                                userInput.nextLine();
                            }
                        }
                        while (!validSize) {
                            try {
                                System.out.println("\n" + "Enter the number of items in the course:");
                                System.out.printf(" > ");
                                inputSize = userInput.nextInt();
                                validSize = true;
                            } catch (InputMismatchException e) {
                                System.out.println("\n" + "Invalid number of items; try again.");
                                // Flushes garbage input to prevent unintended actions
                                userInput.nextLine();
                            }
                        }
                        while (!validCredits) {
                            try {
                                System.out.println("\n" + "Enter the number of credits the course is worth:");
                                System.out.printf(" > ");
                                inputCredits = userInput.nextInt();
                                validCredits = true;
                            } catch (InputMismatchException e) {
                                System.out.println("\n" + "Invalid number of credits; try again.");
                                // Flushes garbage input to prevent unintended actions
                                userInput.nextLine();
                            }
                        }
                        Course newCourse = new Course(inputName, inputSize, inputCredits);
                        theManager.addCourse(newCourse);
                        break;
                    case 3:
                        theManager.deleteLastCourse();
                        break;
                    case 4:
                        int inputCourse;
                        try {
                            if (theManager.getCourseListSize() == 0) {
                                System.out.println("\n" + "No courses are registered; try adding a new one.");
                                break;
                            }
                            System.out.println("Enter the number of a registered course:");
                            System.out.println(theManager.getCourseNames());
                            System.out.printf(" > ");
                            inputCourse = userInput.nextInt();
                            courseMenu(theManager.getCourse(inputCourse));
                        } catch (InputMismatchException e) {
                            System.out.println("\n" + "Invalid number; try again.");
                            // Flushes garbage input to prevent unintended actions
                            userInput.nextLine();
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("\n" + "Invalid number; try again.");
                            // Flushes garbage input to prevent unintended actions
                            userInput.nextLine();
                        }
                        break;
                    case 9:
                        userHasQuit = true;
                        break;
                    default:
                        System.out.println("\n" + "Couldn't understand request; try again.");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n" + "Couldn't understand request; try again.");
                    // Flushes garbage input to prevent infinite looping
                    userInput.nextLine();
                }
            }
        }
    }
    // Accesses a selected course's statistics
    public void courseMenu(Course selectedCourse) {
        Scanner userInput = new Scanner(System.in);
        boolean userHasQuit = false;
        // Keep looping until user quits the menu
        while(!userHasQuit) {
            // This could be unsafe
            // Keep looping until valid input is received
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("\n" + "----------");
                    System.out.println("\n" + "Menu for " + selectedCourse.getName());
                    System.out.println("\n" + "Enter 1 to get a string with course details,");
                    System.out.println("Enter 2 to add a new grade to this course,");
                    System.out.println("Enter 3 to get the list of registered course names,");
                    System.out.println("Enter 9 to quit:");
                    System.out.printf(" > ");
                    int choice = userInput.nextInt();
                    validInput = true;
                    switch (choice) {
                    case 1:
                        System.out.printf(selectedCourse.toString());
                        break;
                    case 2:
                        // Flushes garbage input to prevent unintended actions
                        userInput.nextLine();
                        // Default Grade name and worth are listed
                        String inputName = "newGrade";
                        double inputWorth = 10;
                        boolean validName = false;
                        boolean validWorth = false;
                        while (!validName) {
                            try {
                                System.out.println("\n" + "Enter a grade name:");
                                System.out.printf(" > ");
                                // Check if the name is empty
                                inputName = userInput.nextLine();
                                if (!inputName.isEmpty()) {
                                    validName = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\n" + "Invalid grade name; try again.");
                                // Flushes garbage input to prevent unintended actions
                                userInput.nextLine();
                            }
                        }
                        while (!validWorth) {
                            try {
                                System.out.println("\n" + "Enter the number of marks this grade is worth:");
                                System.out.printf(" > ");
                                inputWorth = userInput.nextDouble();
                                validWorth = true;
                            } catch (InputMismatchException e) {
                                System.out.println("\n" + "Invalid number of marks; try again.");
                                // Flushes garbage input to prevent unintended actions
                                userInput.nextLine();
                            }
                        }
                        Grade newGrade = new Grade(inputName, inputWorth);
                        selectedCourse.addItem(newGrade);
                        break;
                    case 3:
                        try {
                            // Check if no grades are registered in the course
                            if (selectedCourse.getGradeNames().isEmpty()) {
                                System.out.println("\n" + "No grades are registered in this course; try adding a new one.");
                                break;
                            }
                            System.out.println(selectedCourse.getGradeNames());
                        } catch (NullPointerException e) {
                            System.out.println("\n" + "No grades are registered in this course; try adding a new one.");
                        }
                        break;
                    case 9:
                        userHasQuit = true;
                        break;
                    default:
                        System.out.println("\n" + "Couldn't understand request; try again.");
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n" + "Couldn't understand request; try again.");
                    // Flushes garbage input to prevent infinite looping
                    userInput.nextLine();
                }
            }
        }
    }
}
