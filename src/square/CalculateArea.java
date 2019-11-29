package square;

import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Введите название фигуры: ");
        String shape = scanner.nextLine();


        switch (shape.toLowerCase()) {
            case "круг":
                System.out.print(circle.area());
                break;
            case "треугольник":

                System.out.print(triangle.area());
                break;
            case "прямоугольник":

                System.out.print(rectangle.area());
                break;
            default:
                System.out.println("Извините, данной фигуры нет в нашей базе!");
                break;
        }
    }
}
