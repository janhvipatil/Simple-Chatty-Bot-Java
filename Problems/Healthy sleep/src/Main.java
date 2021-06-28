import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        if (h >= a && h <= b) {
            System.out.println("Normal");
        } else if (h > b) {
            System.out.println("Excess");
        } else if (h < a) {
            System.out.println("Deficiency");
        }
    }
}
