import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int cups = scan.nextInt();
        boolean weekend = scan.nextBoolean();
        if (cups >= 15 && cups <= 25 && weekend || cups >= 10 && cups <= 20 && !weekend) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
