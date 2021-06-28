import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong();
        char operator = scan.next().charAt(0);
        long num2 = scan.nextLong();

        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}