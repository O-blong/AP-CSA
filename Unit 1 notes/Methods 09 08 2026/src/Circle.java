public class Circle {
    private int radius = 0;

    public Circle(){
    radius = 0;
}

    public Circle(int x){
        radius = x;
    }
    
    public double calcArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    //getters and setters
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        if(r>=0){
            radius = r;

        }
    }
    public String toString(){
        return "radius is " + radius;
    }
    
}
