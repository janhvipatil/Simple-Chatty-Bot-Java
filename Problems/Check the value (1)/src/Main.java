import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int num = scan.nextInt();
        if(num<10){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}