import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int h1 = scan.nextInt();
        int h2 = scan.nextInt();
        int h3 = scan.nextInt();
        System.out.println(h2 >= h1 && h3 >= h2 || h1 >= h2 && h2 >= h3);
    }
}
