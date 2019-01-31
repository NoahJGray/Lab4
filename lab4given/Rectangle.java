import java.awt.Color;
import java.awt.Point;

public class Rectangle implements Shape{
    private double width;
    private double height;
    private Point topLeft;
    private Color color;

    public Rectangle(double width, double height, Point topLeft, Color color){
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color c){
        this.color = c;
    }

    public double getArea(){
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter(){
        double perim = 2 * this.height + 2 * this.width;
        return perim;
    }

    public void translate(Point p){
        this.topLeft.translate(p.x, p.y);
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public Point getTopLeft(){
        return this.topLeft;
    }

    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Rectangle otherR = (Rectangle) other;
        return this.topLeft == otherR.getTopLeft() &&
               this.width == otherR.getWidth() &&
               this.height == otherR.getHeight();
    }
}