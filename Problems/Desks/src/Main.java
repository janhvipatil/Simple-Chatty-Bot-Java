import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3 = scan.nextFloat();
        System.out.println((int) (Math.ceil(num1 / 2) + Math.ceil(num2 / 2) + Math.ceil(num3 / 2)));
    }
}
