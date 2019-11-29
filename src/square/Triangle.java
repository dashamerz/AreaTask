package square;

public class Triangle extends Shape{
    double x;
    double y;
    Input input = new Input();

    protected double area() {
        double res = input.input(x, y);
        double area;
        area = res / 2;
        return area;
    }
}