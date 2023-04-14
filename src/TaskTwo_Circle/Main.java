package TaskTwo_Circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        try{
            c.setRadius(2);
            System.out.println(c.getArea());
        }catch(IllegalArgumentException e){
            System.out.println("Set positive radius for the circle");
        }
    }
}
