import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        for(int i=A; i<=B; i++) {
            if(i%3==0 && i%5!=0) {
                System.out.println("Fizz");
            }
            else if(i%5==0 && i%3!=0) {
                System.out.println("Buzz");
            }
            else if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}