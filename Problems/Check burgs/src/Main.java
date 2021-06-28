import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();
        if (n < 4) {
            System.out.println(false);
        } else if(str.substring(n-4,n).equals("burg")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

another way:

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myString = scanner.nextLine();
        if (myString.length() < 4) {
            System.out.println(false);
        } else {
            System.out.println(myString.substring(myString.length() - 4).equals("burg"));
        }
    }
}

another way:

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        boolean endsWithBurg = cityName.endsWith("burg");
        System.out.println(endsWithBurg);
    }
}
