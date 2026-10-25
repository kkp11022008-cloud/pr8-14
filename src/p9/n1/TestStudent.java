package p9.n1;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student(104, "Ivan"),
                new Student(101, "Petr"),
                new Student(103, "Anna"),
                new Student(102, "Maria")
        };
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
