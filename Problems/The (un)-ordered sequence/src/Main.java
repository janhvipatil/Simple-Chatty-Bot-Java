import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int count = 0;
        boolean asc = true;
        boolean isSorted = true;

        while (scan.hasNextInt()) {
            int num2 = scan.nextInt();
            if (num2 == 0) {
                break;
            }
            if (count == 0) {
                if (num2 < num1) {
                    asc = false;
                }
            } else if (asc && num2 < num1) {
                isSorted = false;
            } else if (!asc && num2 > num1) {
                isSorted = false;
            }
            count++;
            num1 = num2;
        } System.out.println(isSorted);
    }
}