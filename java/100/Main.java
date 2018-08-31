import java.io.*;
import java.util.*;

public class Main {
    public int calc(int a, int b) {
        if (a > b) {
            return calc(b, a);
        }
        int max = 0;

        for (int i = a; i <= b; i++) {
            max = Math.max(max, this.cycleLength(i));
        }

        return max;
    }

    public int cycleLength(int n) {
        int t = n;
        int count = 1;

        while (t > 1) {
            t = this.nextNumber(t);
            count++;
        }

        return count;
    }

    private int nextNumber(int n) {
        return n % 2 == 0 ? n / 2 : n * 3 + 1;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int result = this.calc(from, to);

            System.out.printf("%d %d %d\n", from, to, result);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
