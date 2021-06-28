import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        String word4 = scan.next();
        String word5 = scan.next();
        String word6 = scan.next();
        String word7 = scan.next();
        String word8 = scan.next();
        System.out.println(word8);
        System.out.println(word7);
        System.out.println(word6);
        System.out.println(word5);
        System.out.println(word4);
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
        }
    }



class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (scan.hasNext()) {
            list.add(scan.next());
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
        scan.close();
    }
}



