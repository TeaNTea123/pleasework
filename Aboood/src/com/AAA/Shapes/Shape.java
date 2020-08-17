package com.AAA.Shapes

abstract public class Shape {
    private String Color = "Red";
    private boolean Filled = true;

    public Shape(){}
    public Shape(String Color,boolean Filled ){
        this.Color  = Color;
        this.Filled = Filled;
    }
    public String getColor(){
        return Color;
    }
    public boolean isFilled(){
        return Filled;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public void setFilled(boolean Filled){
        this.Filled = Filled;
    }
    public String toString(){
        return "{Shape Color = " + Color + ", Filled = " + Filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();





}
