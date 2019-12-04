package square;

import java.util.Scanner;

public class Triangle extends Shape {
    double a;
    double b;
    double c;


    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        a = scanner.nextDouble();
        System.out.println("Введите вторую сторону треугольника: ");
        b = scanner.nextDouble();
        System.out.println("Введите третью сторону треугольника: ");
        c = scanner.nextDouble();
    }
    public double calculateArea() {
        double p = a + b + c;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));;
        return area;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
    public void printData(){
        getData();
        System.out.print("Площадь треугольника равна: " + calculateArea());
        System.out.println();
        System.out.print("Периметр треугольника равен: " + calculatePerimeter());
    }

}