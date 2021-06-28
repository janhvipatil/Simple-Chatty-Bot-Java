import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int busHeight = scan.nextInt();
        int numberOfBridges = scan.nextInt();
        int bridgeCount = 0;
        int crash = 0;
        for (int i = 1; i <= numberOfBridges; i++) {
            int bridgeHeight = scan.nextInt();
            bridgeCount++;
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + bridgeCount);
                crash++;
                break;
            }
        } if (crash == 0) {
            System.out.println("Will not crash");
        }
    }
}
