import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int num = scan.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.print(max);
    }
}
