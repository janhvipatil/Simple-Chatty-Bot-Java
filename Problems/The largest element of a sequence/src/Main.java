import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int max = 0;
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.print(max);
    }
}