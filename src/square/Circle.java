package square;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle extends Shape {
    double radius;

    @Override
    public void getData() throws IOException {
            Scanner scanner = new Scanner(System.in); //{
            System.out.println("Введите радиус: ");
            radius = scanner.nextDouble();
            if (radius > 0){
                calculatePerimeter();
                calculateArea();
            }else{
                System.out.println("Вы ввели некорректные данные!");
                throw new IOException();
            }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2.0 * Math.PI * radius;
    }
    public void printData() throws IOException {
        getData();
        System.out.print("Площадь круга равна: " + calculateArea());
        System.out.println();
        System.out.print("Периметр круга равен: " + calculatePerimeter());
    }

}
