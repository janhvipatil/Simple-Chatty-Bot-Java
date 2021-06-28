import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println((k - (k % n)) / n);
    }
}
