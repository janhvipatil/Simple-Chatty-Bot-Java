import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        str1 = str1.replace(" ", "");
        String str2 = scan.nextLine();
        str2 = str2.replace(" ", "");

        if(str1.equals(str2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}