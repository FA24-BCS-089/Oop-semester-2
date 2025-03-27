public class Main {
    public static void main(String args[]) {

        Principal principal = new Principal("Dr. Syed Asad Hussain", 50, 20);

        School school = new School("Comsats Lahore", "1.5 KM Defence Rd، off Raiwand Road", principal);

        Teacher teacher1 = new Teacher("Shahid Bhatti", 40, 101, "Object Oriented Programming");
        Teacher teacher2 = new Teacher("Abdul Karim Shahid", 35, 102, "Fundamental Programming");

        ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1);
        ClassRoom class2 = new ClassRoom("Grade 9", "G9", teacher2);

        school.addClassRoom(class1);
        school.addClassRoom(class2);

        Student s1 = new Student("Namirah", 19, 201);
        Student s2 = new Student("Laraib", 19, 202);
        Student s3 = new Student("Fatima", 19, 203);
        Student s4 = new Student("Sawera", 18, 204);
        Student s5 = new Student("Moizza", 19, 205);
        Student s6 = new Student("Horia", 19, 206);

        class1.addStudent(s1);
        class1.addStudent(s2);
        class1.addStudent(s3);
        class1.addStudent(s4);
        class1.addStudent(s5);
        class1.addStudent(s6);

        System.out.println(school);

        System.out.println(s1.equals(s2));
        System.out.println(teacher1.equals(new Teacher("Shahid Bhatti", 40, 101, "Object Oriented Programming")));
    }
}