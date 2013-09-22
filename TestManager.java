public class TestManager {

	public static void main(String[] args) {
		
		Manager uvic = new Manager();
		// Myan sem 1 year 1
		Course econ103 = new Course("Economics 103", 3);
		Course phil100 = new Course("Philosophy 100", 6);
		Course engl135 = new Course("English 135", 3);
		Course phil201 = new Course("Philosophy 201", 3);
		// Myan sem 2 year 1
		Course phil203 = new Course("Philosophy 203", 3);
		Course psyc100a = new Course("Psychology 100A", 3);
		Course writ102 = new Course("Writing 102", 3);
		Course csc110 = new Course("Computer Science 110", 3);
		// Myan sum sem year 1
		Course csc115 = new Course("Computer Science 115", 3);
		Course math120 = new Course("Math 120", 3);
		// Myan sem 1 year 2
		Course math100 = new Course("Math 100", 3);
		Course csc106 = new Course("CSC 106", 3);
		Course seng265 = new Course("SENG 265", 3);
		// Adding courses to manager
		uvic.addItem(econ103);
		uvic.addItem(phil100);
		uvic.addItem(engl135);
		uvic.addItem(phil201);
		uvic.addItem(phil203);
		uvic.addItem(psyc100a);
		uvic.addItem(writ102);
		uvic.addItem(csc110);
		uvic.addItem(csc115);
		uvic.addItem(math120);
		uvic.addItem(math100);
		uvic.addItem(csc106);
		uvic.addItem(seng265);
		System.out.println(uvic.getCourseListSize() + " courses currently added to UVic.");
		int i = 0;
		// Econ 103
		addTest("Midterm 1", 0.25, 83.0, uvic.getCourse(i));
		addTest("Midterm 2", 0.25, 60.0, uvic.getCourse(i));
		addLab("Lab", 0.10, 90.0, uvic.getCourse(i));
		addTest("Final", 0.40, 65.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Phil 100
		i++;
		addTest("Test 1", 0.15, 70.0, uvic.getCourse(i));
		addEssay("Essay 1", 0.20, 75.0, uvic.getCourse(i));
		addTest("Test 2", 0.15, 76.67, uvic.getCourse(i));
		addTest("Test 3", 0.15, 66.67, uvic.getCourse(i));
		addEssay("Essay 2", 0.20, 77.50, uvic.getCourse(i));
		addTest("Test 4", 0.15, 70.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// English 135
		i++;
		addEssay("Rhetoric", 0.20, 79.0, uvic.getCourse(i));
		addEssay("Summary", 0.15, 80.0, uvic.getCourse(i));
		addEssay("In-Class Essay", 0.15, 79.0, uvic.getCourse(i));
		addEssay("Research Paper", 0.25, 83.0, uvic.getCourse(i));
		addTest("Final", 0.25, 77.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Phil 201
		i++;
		addAssignment("Assignment 1", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 2", 0.025, 75.0, uvic.getCourse(i));
		addAssignment("Assignment 3", 0.025, 85.0, uvic.getCourse(i));
		addTest("Test 1", 0.15, 92.0, uvic.getCourse(i));
		addAssignment("Assignment 4", 0.025, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 5", 0.025, 85.0, uvic.getCourse(i));
		addAssignment("Assignment 6", 0.025, 80.0, uvic.getCourse(i));
		addTest("Test 2", 0.15, 88.0, uvic.getCourse(i));
		addAssignment("Assignment 7", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 8", 0.025, 80.0, uvic.getCourse(i));
		addAssignment("Assignment 9", 0.025, 85.0, uvic.getCourse(i));
		addTest("Test 3", 0.15, 88.0, uvic.getCourse(i));
		addAssignment("Assignment 10", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 11", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 12", 0.025, 77.50, uvic.getCourse(i));
		addTest("Test 4", 0.15, 70.0, uvic.getCourse(i));
		addAssignment("Assignment 13", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 14", 0.025, 85.0, uvic.getCourse(i));
		addAssignment("Assignment 15", 0.025, 90.0, uvic.getCourse(i));
		addTest("Test 1", 0.15, 84.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Phil 203
		i++;
		addAssignment("Assignment 1", 0.025, 70.0, uvic.getCourse(i));
		addAssignment("Assignment 2", 0.025, 70.0, uvic.getCourse(i));
		addAssignment("Assignment 3", 0.025, 80.0, uvic.getCourse(i));
		addAssignment("Assignment 4", 0.025, 70.0, uvic.getCourse(i));
		addAssignment("Assignment 5", 0.025, 90.0, uvic.getCourse(i));
		addAssignment("Assignment 6", 0.025, 70.0, uvic.getCourse(i));
		addAssignment("Assignment 7", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 8", 0.025, 75.0, uvic.getCourse(i));
		addAssignment("Assignment 9", 0.025, 40.0, uvic.getCourse(i));
		addAssignment("Assignment 10", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 11", 0.025, 0.0, uvic.getCourse(i));
		addAssignment("Assignment 12", 0.025, 65.0, uvic.getCourse(i));
		addAssignment("Bonus Assignment", 0.025, 75.0, uvic.getCourse(i));
		addTest("Test 1", 0.20, 89.0, uvic.getCourse(i));
		addTest("Test 2", 0.20, 90.0, uvic.getCourse(i));
		addTest("Test 3", 0.20, 80.0, uvic.getCourse(i));
		addTest("Test 4", 0.15, 95.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Psyc 100A
		i++;
		addAssignment("Assignment 1", 0.10, 92.50, uvic.getCourse(i));
		addAssignment("Assignment 2", 0.10, 95.00, uvic.getCourse(i));
		addAssignment("Assignment 3", 0.10, 100.0, uvic.getCourse(i));
		addQuiz("Quiz", 0.05, 86.67, uvic.getCourse(i));
		addTest("Exam 1", 0.20, 84.50, uvic.getCourse(i));
		addTest("Exam 2", 0.20, 72.22, uvic.getCourse(i));
		addTest("Exam 3", 0.20, 90.0, uvic.getCourse(i));
		addLab("Lab 1", 0.025, 100.0, uvic.getCourse(i));
		addLab("Lab 2", 0.025, 89.0, uvic.getCourse(i));
		addLab("Lab 3", 0.025, 100.0, uvic.getCourse(i));
		addLab("Lab 4", 0.025, 100.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Writ 102
		i++;
		addEssay("Instructor Profile", 0.25, 77.0, uvic.getCourse(i));
		addEssay("Event Report", 0.30, 85.0, uvic.getCourse(i));
		addEssay("Freelance Report", 0.30, 90.0, uvic.getCourse(i));
		addTest("Final", 0.15, 90.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// CSC 110
		i++;
		addLab("Lab Attendance", 0.02, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 1", 0.04, 60.0, uvic.getCourse(i));
		addAssignment("Assignment 2", 0.04, 80.0, uvic.getCourse(i));
		addAssignment("Assignment 3", 0.04, 70.0, uvic.getCourse(i));
		addAssignment("Assignment 4", 0.04, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 5", 0.04, 65.0, uvic.getCourse(i));
		addAssignment("Assignment 6", 0.04, 45.0, uvic.getCourse(i));
		addAssignment("Assignment 7", 0.04, 80.0, uvic.getCourse(i));
		addTest("Midterm 1", 0.16, 88.57, uvic.getCourse(i));
		addTest("Midterm 2", 0.16, 89.23, uvic.getCourse(i));
		addTest("Final", 0.38, 80.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// CSC 115
		i++;
		addAssignment("Assignment 1", 0.03, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 2", 0.03, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 3", 0.03, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 4", 0.03, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 5", 0.03, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 6", 0.03, 100.0, uvic.getCourse(i));
		addAssignment("Assignment 7", 0.03, 80.0, uvic.getCourse(i));
		addAssignment("Assignment 8", 0.03, 100.0, uvic.getCourse(i));
		addTest("Midterm 1", 0.10, 91.67, uvic.getCourse(i));
		addTest("Midterm 2", 0.10, 92.86, uvic.getCourse(i));
		addLab("Lab Attendance", 0.10, 90.0, uvic.getCourse(i));
		addParticipation("Attendance", 0.06, 100.0, uvic.getCourse(i));
		addTest("Final", 0.40, 76.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Math 120
		i++;
		addAssignment("Review Assignment", 0.0125, 75.0, uvic.getCourse(i));
		addAssignment("Assignment 1", 0.0125, 66.67, uvic.getCourse(i));
		addAssignment("Assignment 2", 0.0125, 73.33, uvic.getCourse(i));
		addAssignment("Assignment 3", 0.0125, 60.00, uvic.getCourse(i));
		addAssignment("Assignment 4", 0.0125, 92.86, uvic.getCourse(i));
		addAssignment("Assignment 6", 0.0125, 82.61, uvic.getCourse(i));
		addAssignment("Assignment 7", 0.0125, 44.83, uvic.getCourse(i));
		addAssignment("Assignment 8", 0.0125, 100.0, uvic.getCourse(i));
		addTest("Test 1", 0.10, 81.82, uvic.getCourse(i));
		addTest("Test 2", 0.10, 80.65, uvic.getCourse(i));
		addTest("Test 3", 0.10, 93.55, uvic.getCourse(i));
		addTest("Final", 0.50, 77.0, uvic.getCourse(i));
		System.out.println(uvic.getCourse(i).getName() + "'s final mark: " +
											uvic.getCourse(i).getOverallMark());
		// Math 100
		// CSC 106
		// Seng 265
		// Double check all courses have proper grades attached still
		System.out.println("\nTesting again to make sure everything stayed the same.\n");
		for (i = 0; i < uvic.getCourseListSize(); i++) {
			System.out.println(uvic.getCourse(i).getName() + "'s final mark: "
							+ uvic.getCourse(i).getOverallMark());
		}
		System.out.println("Current GPA: " + uvic.getGPA());
	}
	
	public static void addAssignment(String n, double w, double cM, Course c) {
		Grade a = new Assignment();
		a.setName(n);
		a.setWorth(w);
		a.setCurrMark(cM);
		c.addItem(a);
	}
	
	public static void addQuiz(String n, double w, double cM, Course c) {
		Grade q = new Quiz();
		q.setName(n);
		q.setWorth(w);
		q.setCurrMark(cM);
		c.addItem(q);
	}
	
	public static void addTest(String n, double w, double cM, Course c) {
		Grade t = new Test();
		t.setName(n);
		t.setWorth(w);
		t.setCurrMark(cM);
		c.addItem(t);
	}
	
	public static void addLab(String n, double w, double cM, Course c) {
		Grade l = new Lab();
		l.setName(n);
		l.setWorth(w);
		l.setCurrMark(cM);
		c.addItem(l);
	}
	
	public static void addParticipation(String n, double w, double cM, Course c) {
		Grade p = new Participation();
		p.setName(n);
		p.setWorth(w);
		p.setCurrMark(cM);
		c.addItem(p);
	}
	
	public static void addEssay(String n, double w, double cM, Course c) {
		Grade e = new Essay();
		e.setName(n);
		e.setWorth(w);
		e.setCurrMark(cM);
		c.addItem(e);
	}
}