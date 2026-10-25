package p9.n2;

public class Student {
    private int iDNumber;
    private String name;
    private double gpa;
    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }
    public int getIDNumber() {
        return iDNumber;
    }
    public String getName() {
        return name;
    }
    public double getGPA() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Student{ID=" + iDNumber + ", Name='" + name + "', GPA=" + gpa + "}";
    }
}