
package com.mycompany.fci;

public class Circle extends Shape{
private double red;

    public double getRed() {
        return red;
    }

    public Circle(double red, String color) {
        super(color);
        this.red = red;
    }

    public Circle(double red){
        super();
        this.red = red;
    }

    public void setRed(double red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "Circle{" + "red=" + red + '}';
    }


    @Override
    public double getArea() {
        return Math.PI* Math.pow(this.red,2);
    }

  @Override
    public double getperemiter() {
       return 2*Math.PI*this.red;
    }

    @Override
    public String HowToDraw() {
        return "Circle";
    }
    
}
