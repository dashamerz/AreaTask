package square;

import java.util.Scanner;

public class Rectangle extends Shape {
    double height;
    double width;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        height = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        width = scanner.nextDouble();
    }
    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2.0 * (height + width);
    }
    public void printData(){
        getData();
        System.out.print("Площадь прямоугольника равна: " + calculateArea());
        System.out.println();
        System.out.print("Периметр прямоугольника равен: " + calculatePerimeter());
    }
}
