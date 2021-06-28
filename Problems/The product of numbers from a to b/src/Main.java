import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        long multi = 1;
        for (int i = a; i < b; i++) {
            multi *= i;
        }
        System.out.println(multi);
    }
}
