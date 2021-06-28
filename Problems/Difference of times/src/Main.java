import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int hour1 = scan.nextInt();
        int minute1 = scan.nextInt();
        int second1 = scan.nextInt();
        int hour2 = scan.nextInt();
        int minute2 = scan.nextInt();
        int second2 = scan.nextInt();
        int output = (hour2 - hour1)*3600 + (minute2-minute1)*60 + (second2-second1);
        System.out.println(output);
    }
}