import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = str.charAt(0);
        if(c == 'J' || c == 'j') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}