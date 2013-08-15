public class MainTest {

    public static void main(String[] args) {
        Manager theManager = new Manager(10);
        Course TestCourse = new Course("TestCourse", 10, 4);
        Course TestCourse1 = new Course("TestCourse1", 10, 4);
        System.out.println(TestCourse.getName());
        theManager.addItem(TestCourse);
        theManager.addItem(TestCourse1);         
        System.out.println(theManager.getCourseName(1));        
    }
}
