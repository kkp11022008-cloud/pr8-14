package p8;
//import java.util.Scanner;
//public class n12 {
//    Scanner sc = new Scanner(System.in);
//    void nechet() {
//        int n = sc.nextInt();
//        if (n == 0) {
//            return;
//        }
//        if (n % 2 != 0) {
//            System.out.println(n);
//        }
//        nechet();
//    }
//    public static void main(String[] args) {
//        new n12().nechet();
//    }
//}
import java.util.Scanner;
import java.util.ArrayList;

public class n12 {
    void nechet() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        class Reader {
            void read() {
                int n = sc.nextInt();
                if (n == 0) {
                    return;
                }
                numbers.add(n);
                read();
            }
        }
        new Reader().read();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                System.out.println(numbers.get(i));
            }
        }
    }
    public static void main(String[] args) {
        new n12().nechet();
    }
}