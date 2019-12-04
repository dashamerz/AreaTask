package square;

import java.io.IOException;
import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Введите название фигуры: ");
        String shape = scanner.nextLine();


        switch (shape.toLowerCase()) {
            case "круг":
                circle.printData();
                break;
            case "треугольник":
                triangle.printData();
                break;
            case "прямоугольник":
                rectangle.printData();
                break;
            default:
                System.out.println("Извините, данной фигуры нет в нашей базе!");
                break;
        }
    }
}
