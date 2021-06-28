import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int n = scan.nextInt();
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}