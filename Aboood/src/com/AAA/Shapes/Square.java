public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String Color, boolean Filled){
        super(side, side, Color, Filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString(){
        return "{Rectangle Color = " + super.getColor() + ", Filled = " + super.isFilled() + ", Side = " + super.getWidth();
    }
}
