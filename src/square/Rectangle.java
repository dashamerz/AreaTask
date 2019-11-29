package square;

public class Rectangle extends Shape{
    double x;
    double y;
    Input input = new Input();

    protected double area(){
        double res = input.input(x, y);
        double area;
        area = res;
        return area;
    }
}
