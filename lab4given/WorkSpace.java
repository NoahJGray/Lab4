import java.util.List;
import java.util.LinkedList;

import java.awt.Color;

public class WorkSpace{
    private List<Shape> shapes;

    public WorkSpace(){
        shapes = new LinkedList<>();
    }

    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public Shape get(int index){
        return this.shapes.get(index);
    }

    public int size(){
        return this.shapes.size();
    }

    public List<Circle> getCircles(){
        List<Circle> circles = new LinkedList<>();
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                Circle shapeC = (Circle) shape;
                circles.add(shapeC);
            }
        }
        return circles;
    }

    public List<Rectangle> getRectangles(){
        List<Rectangle> rectangles = new LinkedList<>();
        for (Shape shape : this.shapes){
            if (shape instanceof Rectangle){
                Rectangle shapeR = (Rectangle) shape;
                rectangles.add(shapeR);
            }
        }
        return rectangles;
    }

    public List<Triangle> getTriangles(){
        List<Triangle> triangles = new LinkedList<>();
        for (Shape shape : this.shapes){
            if (shape instanceof Triangle){
                Triangle shapeT = (Triangle) shape;
                triangles.add(shapeT);
            }
        }
        return triangles;
    }

    public List<Shape> getShapesByColor(Color color){
        List<Shape> one_color = new LinkedList<>();
        for (Shape shape : this.shapes){
            if (shape.getColor() == color) one_color.add(shape);
        }
        return one_color;
    }

    public double getAreaOfAllShapes(){
        double total_area = 0;
        for (Shape shape : this.shapes){
            total_area += shape.getArea();
        }
        return total_area;
    }

    public double getPerimeterOfAllShapes(){
        double total_perim = 0;
        for (Shape shape : this.shapes){
            total_perim += shape.getPerimeter();
        }
        return total_perim;
    }
}