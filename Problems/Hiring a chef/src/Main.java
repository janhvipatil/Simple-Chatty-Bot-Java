import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int age = scan.nextInt();
        String stageOfEducation = scan.next();
        int yearsOfExperience = scan.nextInt();
        String cuisinePreference = scan.next();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}
