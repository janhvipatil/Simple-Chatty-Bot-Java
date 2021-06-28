import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        float m = scan.nextFloat();
        float p = scan.nextFloat();
        float k = scan.nextFloat();
        int years = 0;
        while (m < k) {
            m += m * (p / 100);
            years++;
        }
        System.out.println(years);
    }
}
