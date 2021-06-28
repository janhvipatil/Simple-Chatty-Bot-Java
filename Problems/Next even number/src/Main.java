import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + 2); 
            } 
        else {
            System.out.println(num + 1); 
            } 
    }
}
