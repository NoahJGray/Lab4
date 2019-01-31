import java.lang.Math;

import java.awt.Color;
import java.awt.Point;

public class Triangle implements Shape{
    private Point a;
    private Point b;
    private Point c;
    private Color color;

    public Triangle(Point a, Point b, Point c, Color color){
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color c){
        this.color = c;
    }

    public double getArea(){
        double area = Math.abs((this.a.x * (this.b.y - this.c.y) + 
                                this.b.x * (this.c.y - this.a.y) + 
                                this.c.x * (this.a.y - this.b.y)) / 2);
        return area;
    }

    public double getPerimeter(){
        double perim = distance(this.a, this.b) + distance(this.b, this.c) + distance(this.c, this.a);
        return perim;
    }

    public void translate(Point p){
        this.a.translate(p.x, p.y);
        this.b.translate(p.x, p.y);
        this.c.translate(p.x, p.y);
    }


    private double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public Point getVertexA(){
        return this.a;
    }

    public Point getVertexB(){
        return this.b;
    }

    public Point getVertexC(){
        return this.c;
    }

    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Triangle otherT = (Triangle) other;
        return this.a == otherT.getVertexA() &&
               this.b == otherT.getVertexB() &&
               this.c == otherT.getVertexC();
    }
}