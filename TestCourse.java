import java.util.Scanner;
import java.io.*;

public class TestCourse {

	public static void main(String[] args) throws FileNotFoundException {
		
		Course[] yearOne = new Course[8];
		
		Course c1 = new Course("Econ 103", 3);
		Grade g1 = new Grade("Midterm 1", 0.25);
		g1.setCurrMark(0.83);
		Grade g2 = new Grade("Midterm 2", 0.25);
		g2.setCurrMark(0.60);
		Grade g3 = new Grade("Lab", 0.10);
		g3.setCurrMark(0.90);
		Grade g4 = new Grade("Final", 0.40);
		g4.setCurrMark(0.65);
		c1.addItem(g1);
		c1.addItem(g2);
		c1.addItem(g3);
		c1.addItem(g4);
		
		Course c2 = new Course("English 135", 3);
		g1.setName("Rhetoric");
		g1.setWorth(0.20);
		g1.setCurrMark(0.79);
		g2.setName("Summary");
		g2.setWorth(0.15);
		g2.setCurrMark(0.80);
		g3.setName("In-Class Proposal");
		g3.setWorth(0.15);
		g3.setCurrMark(0.79);
		g4.setName("Research");
		g4.setWorth(0.25);
		g4.setCurrMark(0.83);
		Grade g5 = new Grade("Final", 0.25);
		g5.setCurrMark(0.77);
		c2.addItem(g1);
		c2.addItem(g2);
		c2.addItem(g3);
		c2.addItem(g4);
		c2.addItem(g5);
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}