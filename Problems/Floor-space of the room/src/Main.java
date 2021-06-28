import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();
        double area;
        double perimeter;
        switch (shape) {
            case "triangle":
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                perimeter = (a+b+c)/2;
                area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
                System.out.println(area);
                break;
            case "rectangle":
                double aa = scan.nextDouble();
                double bb = scan.nextDouble();
                area = aa * bb;
                System.out.println(area);
                break;
            case "circle":
                double r = scan.nextDouble();
                area = 3.14 * r * r;
                System.out.println(area);
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}