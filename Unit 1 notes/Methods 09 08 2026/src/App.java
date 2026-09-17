/* Use of multiple methods, definitions for void, static, and pow. */
import java.util.Scanner;
public class App {
    public static void sum(int a, int b){
        
    }
    public static void main(String[] args) throws Exception {
        //Method Type 1
        /* Scanner s1 = new Scanner(System.in);
        s1.nextLine(); //not static (and in another file) */

        //Method type 2
        /*sum(1,2); //static in this current file
        sum(2,3); //static
        int x = 44;
        int z = 6;
        System.out.println(x);

        //Method type 3 
        double y = Math.pow(6,3);
        System.out.println(y);
        System.out.println(Math.pow(6,3)); //static in another file
        System.out.println((int)(Math.random()*26) + 5);

        int g = 6;
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(1,2);
        double w = r1.calcArea();
        System.out.println(w);

        System.out.println(r1.calcPerimeter());

        r1.calcArea();
        r1.calcPerimeter();

        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        System.out.println(c1.calcArea());
        System.out.println(c2.calcArea());

        //r1 = Rectangle() **Remeber**
        System.out.println(r1.getLength());
        r1.setLength(17);
        System.out.println(r1.calcArea());
        //why is length private?
        //how can I make a workd around?

        System.out.println(r1.getWidth());
        r1.setLength(18);
        System.out.println(r1.calcArea());

        Circle c11 = new Circle(1);
        System.out.println(c11.getRadius());
        c11.setRadius(10);
        System.out.print(c11.getRadius());*/

        String myString = "hi";
        myString = "hello";
        //strings are immutable which means i can't change them
        //I can only reset them. This makes the code look like they're primitive types

        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(myString.substring(1,4));
        System.out.println(myString.substring(3));
        
        String myString2 = "hello";
        System.out.println(myString.equals(myString2));
        //compares contents of string, not the memory location which may differ

        System.out.println(myString.indexOf("l"));
        //Should give us location of the first l in hello

        System.out.println("D".compareTo("d"));
        //takes the ASCII
    }
}
