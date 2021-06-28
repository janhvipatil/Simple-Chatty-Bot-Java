import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if (count > num) {
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}
