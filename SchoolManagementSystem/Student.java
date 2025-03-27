public class Student extends Person {
    	private int rollNumber;

    	public Student(String name, int age, int rollNumber) {
        	super(name, age);
        	this.rollNumber = rollNumber;
    	}

    	@Override
    	public String toString() {
        	return "Student: " + super.toString() + ", Roll Number: " + rollNumber;
    	}

    	@Override
    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	Student student = (Student) obj;
        	return rollNumber == student.rollNumber;
    	}
}