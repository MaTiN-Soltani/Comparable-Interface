public class Circle extends Shape implements Comparable<Circle>{
    private int radius;

//====================================================================
    //encapsulation
    public void setRadius(int radius) {
        if (radius >= 0)
            this.radius = radius;
        else
        this.radius = 0;
    }
    public int getRadius() {
        return radius;
    }
    
//====================================================================
    //Constructor
    public Circle ()
    {
        this(0);
    }
    public Circle(int radius)
    {
        setRadius(radius);
    }

//====================================================================  
    //methods  
    @Override
    public int compare(Comparable<Circle> c) {
        if (this.radius > ((Circle) c).getRadius())
            return 1;
        else if (this.radius == ((Circle) c).getRadius())
            return 0;
        else
            return (-1);
    }
    
    @Override
    public String toString() {
        return "radius = " + getRadius();
    }
}
