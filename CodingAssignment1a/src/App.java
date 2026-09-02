import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner (System.in);
        
        //Program one//
        System.out.println("What is your Username");
        String userName = s1.nextLine();
        System.out.println("Hi " + userName + ", welcome to AP Computer Science A!");

        //Program two//
        System.out.println("Off the top of your head, give me three names.");
        System.out.println("Please give me name one: ");
        String nameOne = s1.nextLine();
        System.out.println("Please give me name two: ");
        String nameTwo = s1.nextLine();
        System.out.println("Please give me name three: ");
        String nameThree = s1.nextLine();
        System.out.println(nameThree + ", " + nameTwo + ", "+ nameOne);

        //Program three//
        System.out.println("What is your weight in pounds?");
        double userWeight = s1.nextDouble();
        System.out.println("Your weight on the following planets are");
        System.out.println("Mercury: " + (userWeight * 0.4));
        System.out.println("Venus: " + (userWeight * 0.9));
        System.out.println("Mars: " + (userWeight * 0.38));
        System.out.println("Jupiter: " + (userWeight * 2.3));
        System.out.println("Saturn: " + (userWeight * 1.1));
        System.out.println("Uranus: " + (userWeight * 0.92));
        System.out.println("Neptune: " + (userWeight * 1.2));

        //Program four//
        System.out.println("Give me any amount of seconds.");
        int userSeconds = s1.nextInt();
        System.out.println(userSeconds);
        System.out.println((userSeconds/3600) + " hours, " + ((userSeconds % 3600)/60) + " minutes, and " + (userSeconds % 60) + " seconds");
    }
}
