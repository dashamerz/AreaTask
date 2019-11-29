package square;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public double input(double x, double y){
        System.out.println("Введите данные: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        double result = x * y;
        System.out.println("Площадь фигуры равна: ");
        return result;
    }


    public double input(double z){
        System.out.println("Введите данные: ");
        z = scanner.nextDouble();
        System.out.println("Площадь фигуры равна: ");

        return z;
    }


}
