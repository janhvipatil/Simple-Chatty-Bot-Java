import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int days = scan.nextInt();
        int food = scan.nextInt() * days;
        int flight = scan.nextInt() * 2;
        int hotel = scan.nextInt() * (days - 1);
        System.out.println(hotel + flight + food);

    }
}
