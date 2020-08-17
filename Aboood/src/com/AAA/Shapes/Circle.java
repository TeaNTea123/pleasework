public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String Color, boolean Filled){
        super(Color, Filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius*radius;
    }
    public double getPerimeter(){
        return 3.14*2*radius;
    }
    public String toString(){
        return "{Circle Color = " + super.getColor() + ", Filled = " + super.isFilled() + ", Radius = " + radius;
    }
}
