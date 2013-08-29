public class TestManager {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		Course c1 = new Course("A", 1);
		Course c2 = new Course("B", 1);
		Course c3 = new Course("C", 1);
		Course c4 = c1;
		Course c5 = new Course("D", 2);
		
		m.addCourse(c1);
		m.addCourse(c2);
		m.addCourse(c3);
		m.addCourse(c4);
		m.addCourse(c5);
		System.out.println(m.getCourse(7));
		
	}
	
}