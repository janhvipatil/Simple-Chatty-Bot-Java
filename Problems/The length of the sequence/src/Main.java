import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) { 
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
