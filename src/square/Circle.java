package square;


public class Circle extends Shape{
    double z;
    Input input = new Input();

    protected double area () {
        double radius = input.input(z);
        double area;
        area = Math.PI * radius  * radius;
        return area;

    }

}
