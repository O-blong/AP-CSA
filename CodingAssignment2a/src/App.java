import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner (System.in);
        
        //Introduction
        System.out.println("Welcome to Mad Libs!");
        System.out.println("Enter the following, seperated by a comma and a space: ");
        System.out.println("Verb, Verb (with -ed), teacher name, adjective, song title, student name, adjective");
        
        //User's list of words
        String userWords = s1.nextLine();
        String[] words = userWords.split(", ");

        String verb = words[0];
        String verded = words[1];
        String teacherName = words[2];
        String adjective = words[3];
        String songTitle = words[4];
        String studentName = words[5];
        String adjective2 = words[6];

        //MadLib :)
        System.out.println("It was a " + adjective + " day at AP Computer Science, when teacher " + teacherName + " burst in the doorway. They started singing " + songTitle + " while " + studentName + " " + verded + " with them. The whole class clapped as " + studentName + " did their signiture dance move: the " + adjective2 + " " + verb + ".");

    }
}
