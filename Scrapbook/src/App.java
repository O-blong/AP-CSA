 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner (System.in);
        
        System.out.println("Username: ");
        String userName = s1.nextLine();
        System.out.println("Username: " + userName);
        
        System.out.println("what is your favorite number?");
        int favNum = s1.nextInt();
        System.out.println("Your favorite number is: " + favNum);

        System.out.println("What is your grade point average?");
        double gpa = s1.nextDouble();
        System.out.println("Your grade point average is " + gpa + ".");

        s1.nextLine();
        
        System.out.println("What is your favorite word?");
        String favWord = s1.nextLine();
        System.out.println("Your favorite word is " + favWord + ".");


    }
}