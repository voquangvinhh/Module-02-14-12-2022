import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow", false, x);
        shapes[1] = new Circle();
        shapes[2] = new Circle("melinda", true, x);

        System.out.println("Pre-sorted: ");
        for (Shape a : shapes){
            System.out.println(a);
        }


        System.out.println("After -sorted");
        for (Shape a : shapes){
            a.resize(Math.random()*1000);
        }
        Shape.printShape(shapes);
    }
}