
package com.mycompany.fci;


    }

    public Date getDateCreated() {
        return dateCreated;import java.util.Date;


public abstract class Shape implements Drawable {
    
    private Date dateCreated;
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getperemiter();
    
    
    
    
}
