public class Rectangle {
    private int length;
    private int width;
    
    //special method: constructor
    //first method in a reference type class
    //define the value for 
    public Rectangle(){
        length = 0;
        width = 0;
    }
    //create a constructor with parameters
    //Parameters can differentiate methods rather than names
    //method overloading - 2 methods, same name, diff num of parameters
    public Rectangle(int x, int y){
        length = x;
        width = y;
    }
    //This is not a constructor, so it's not special
    //it needs descriptive words
    //This will only be called on a preexisting rectangle object, so it's not static
    public double calcArea(){
        //return means sending something outside of the method
        return length*width;
    }

    public double calcPerimeter(){
        return ((2*length)+(2*width));
    }


}