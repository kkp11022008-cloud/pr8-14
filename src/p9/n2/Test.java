package p9.n2;

public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Алексей", 3.7),
                new Student(102, "Мария", 4.8),
                new Student(103, "Иван", 3.9),
                new Student(104, "Елена", 4.5),
                new Student(105, "Дмитрий", 4.1)
        };
        SortingStudentsByGPA.quickSort(
                students, 0, students.length - 1
        );
        for (Student s : students) {
            System.out.println(s);
        }
    }
}