import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}
