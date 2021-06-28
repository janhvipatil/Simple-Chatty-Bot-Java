import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= n; i++) {
            int grade = scan.nextInt();
            if (grade == 5) {
                a++;
            } else if (grade == 4) {
                b++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 2) {
                d++;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}
