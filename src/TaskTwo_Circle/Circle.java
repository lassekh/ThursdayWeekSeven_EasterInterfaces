package TaskTwo_Circle;

import static java.lang.Math.PI;

public class Circle {
    private double radius;
    public Circle(){
        this.radius = radius;
    }
    public void setRadius(double i) throws IllegalArgumentException{
        if(i < 0){
            throw new IllegalArgumentException("Can't set negative radius");
        }else{
            this.radius = i;
        }
    }
    public double getArea(){
        double area = PI*(Math.pow(this.radius, 2));
        return area;
    }
}
