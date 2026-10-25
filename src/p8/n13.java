package p8;

import java.io.IOException;

public class n13 {
    static int readNumber() throws IOException {
        int c;

        do {
            c = System.in.read();
        } while (c != -1 && c <= ' ');

        if (c == -1) {
            return -1;
        }

        int n = 0;

        while (c > ' ') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }

        return n;
    }

    static void printNumbers() throws IOException {
        int n = readNumber();

        if (n <= 0) {
            return;
        }

        System.out.println(n);

        int next = readNumber();

        if (next <= 0) {
            return;
        }

        printNumbers();
    }

    public static void main(String[] args) throws IOException {
        printNumbers();
    }
}