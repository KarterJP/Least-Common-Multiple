import java.util.*;

public class LCM {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println(findLcm(a, b));
    }

    private static long findLcm(long a, long b) {
        long bigger;
        long smaller;
        long lcm = 0;

        if (a > b) {
            bigger = a;
            smaller = b;
        } else {
            bigger = b;
            smaller = a;
        }

        if (a != b) {
            for (long i = bigger; i <= a * b; i += bigger) {
                if (i % smaller == 0) {
                    lcm = i;
                    break;
                }
            }
        } else {
            lcm = a;
        }

        return lcm;
    }
}
