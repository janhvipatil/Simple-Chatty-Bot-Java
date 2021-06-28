import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fix = 0;
        int reject = 0;
        int perfect = 0;
        for (int i = 1; i <= n; i++) {
            int detected = scan.nextInt();
            if (detected == 1) {
                fix++;
            } else if (detected == -1) {
                reject++;
            } else if (detected == 0) {
                perfect++;
            }
        }
        System.out.print(perfect + " " + fix + " " + reject);
    }
}
