import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int thousand = num / 1000;
        int hundred = (num / 100) % 10;
        int ten = (num % 100) / 10;
        int one = num % 10;
        if (thousand == one && hundred == ten) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}
