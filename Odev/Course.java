package Odev;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName) { this.courseName = courseName; }

    public void addStudent(String student) { students[numberOfStudents++] = student; }
    public String[] getStudents() { return students; }
    public int getNumberOfStudents() { return numberOfStudents; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course courseClone = (Course) super.clone();
        courseClone.students = students.clone();
        return courseClone;
    }
}