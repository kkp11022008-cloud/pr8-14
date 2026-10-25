package p8;
import java.util.Scanner;
public class n11 {
    Scanner sc = new Scanner(System.in);
    int count() {
        int n = sc.nextInt();
        if (n == 0) {
            int next = sc.nextInt();
            if (next == 0) {
                return 0;
            }
            if (next == 1) {
                return 1 + count();
            }
            return count();
        }
        if (n == 1) {
            return 1 + count();
        }
        return count();
    }
    public static void main(String[] args) {
        System.out.println(new n11().count());
    }
}