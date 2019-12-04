package square;

import java.io.IOException;

public abstract class Shape {

    public abstract void getData() throws IOException;

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }
}
