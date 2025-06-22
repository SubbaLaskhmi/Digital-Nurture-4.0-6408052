package MVCPattern;

public class StudentController {
	private Student student;
    private StudentView view;
    public StudentController(Student student, StudentView view) 
    {
        this.student = student;
        this.view = view;
    }
    public void setStudentName(String name) 
    {
        student.setName(name);
    }
    public void setStudentGrade(String grade) 
    {
        student.setGrade(grade);
    }
    public void updateView() 
    {
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }
}
