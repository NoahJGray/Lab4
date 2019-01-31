import java.lang.Math;
import java.awt.Color;
import java.awt.Point;

public class Circle implements Shape{
    private double radius;
    private Point center;
    private Color color;

    public Circle(double radius, Point center, Color color){
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color c){
        this.color = c;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public double getPerimeter(){
        double perim = Math.PI * this.radius * 2;
        return perim;
    }

    public void translate(Point p){
        this.center.translate(p.x, p.y);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Point getCenter(){
        return this.center;
    }

    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Circle otherC = (Circle) other;
        return this.center == otherC.getCenter() &&
               this.radius == otherC.getRadius();
    }
}