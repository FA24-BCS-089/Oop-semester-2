import java.util.Arrays;

public class ClassRoom {
    	private String className;
    	private String classCode;
    	private Teacher teacher;
    	private Student[] students;
    	private int studentCount;

    	public ClassRoom(String className, String classCode, Teacher teacher) {
        	this.className = className;
        	this.classCode = classCode;
        	this.teacher = teacher;
        	this.students = new Student[5]; // Max 5 students
        	this.studentCount = 0;
    	}

    	public boolean addStudent(Student student) {
        	if (studentCount < 5) {
            		students[studentCount++] = student;
            		return true;
        	} else {
            	System.out.println("Class " + className + " is full. Cannot add student " + student.name);
            	return false;
        	}
    	}

    	@Override
    	public String toString() {
        	return "Class: " + className + " (" + classCode + ")\n" + "Teacher: " + teacher.toString() + "\n" + "Students: " + Arrays.toString(students);
    	}
}