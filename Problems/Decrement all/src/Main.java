import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        while (scan.hasNext()){
            int num = scan.nextInt();
            System.out.print(num-1 + " ");
        }
    }
}