package p9.n2;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
    }
    public static void quickSort(Student[] students, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        Student pivot = students[(low + high) / 2];
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        while (i <= j) {
            while (comparator.compare(students[i], pivot) < 0) {
                i++;
            }
            while (comparator.compare(students[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(students, low, j);
        }
        if (i < high) {
            quickSort(students, i, high);
        }
    }
}