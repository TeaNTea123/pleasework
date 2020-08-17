import java.security.PublicKey;
import java.util.Arrays;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String Color , boolean Filled){
        super(Color,Filled);
        this.length = length;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea() {
        return length*width;
    }
    public double getPerimeter(){
        return 2*length + 2*width;
    }
    public String toString(){
        return "{Rectangle Color = " + super.getColor() + ", Filled = " + super.isFilled() + ", Width = " + width + ", Length = " + length;
    }
    
}
