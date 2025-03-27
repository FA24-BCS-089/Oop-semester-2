public class Teacher extends Person {
    	private int teacherID;
    	private String subject;

    	public Teacher(String name, int age, int teacherID, String subject) {
        	super(name, age);
        	this.teacherID = teacherID;
        	this.subject = subject;
    	}

    	@Override
    	public String toString() {
        	return "Teacher: " + super.toString() + ", ID: " + teacherID + ", Subject: " + subject;
    	}

    	@Override
    	public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	Teacher teacher = (Teacher) obj;
        	return teacherID == teacher.teacherID;
    	}
}