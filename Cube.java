
package com.mycompany.fci;


public class Cube extends ThreeDshape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public Cube(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }

    @Override
    public double getVolume() {
      return Math.pow(side, 3);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getperemiter() {
     return this.getArea();
    }

    @Override
    public String HowToDraw() {
        return "Cube";
    }
    
}
