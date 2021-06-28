import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        long m = scan.nextLong();
        long fact;
        int n = 0;
        int i;
        do {
            n += 1;
            fact = 1;
            for (i = 1; i <= n; i++) {
                fact *= i;
            }
        } while (fact <= m);
        System.out.println(n);
    }
}
