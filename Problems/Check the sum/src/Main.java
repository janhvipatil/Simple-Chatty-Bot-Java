import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1+num2==20 || num2+num3==20 || num1+num3==20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}