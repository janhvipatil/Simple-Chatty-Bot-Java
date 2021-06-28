import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int h = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = 0;
        int dayCount = 0;
        while (x < h) {
            x = x + a;
            dayCount++;
            if (x >= h) {
                System.out.println(dayCount);
                break;
            }
            x = x - b;
        }
    }
}
