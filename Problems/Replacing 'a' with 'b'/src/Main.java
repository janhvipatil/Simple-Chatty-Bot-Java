import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replace("a", "b");
        System.out.println(str);
    }
}