import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();
        str = str.substring(a, b+1);
        System.out.println(str);
    }
}