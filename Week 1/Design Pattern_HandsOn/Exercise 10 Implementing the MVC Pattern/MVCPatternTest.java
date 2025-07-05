package MVCPattern;

public class MVCPatternTest {
	public static void main(String[] args) {
        Student student = new Student("Alice", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();

        System.out.println("\n--- Updating Student ---\n");
        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}

