import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}