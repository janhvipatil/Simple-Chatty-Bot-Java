import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int postiveCount = 0;
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num > 0) {
                postiveCount++;
            }
        }
        if (postiveCount == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
