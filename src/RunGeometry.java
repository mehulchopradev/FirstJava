import com.abc.geometry.ShapeStatistics;
import com.abc.geometry.entities.Shape;
import com.globalpayex.geometry.entities.Circle;
import com.globalpayex.geometry.entities.Rectangle;
import com.globalpayex.geometry.entities.Square;

// Manager
public class RunGeometry {

    public static void main(String[] args) {
        Square square = new Square(7);
        ShapeStatistics.print(square);

        Rectangle rectangle = new Rectangle(8, 4);
        ShapeStatistics.print(rectangle);

        // new Shape(); // Cannot create object of an abstract class
        Shape s; // this is valid

        ShapeStatistics.print(new Circle(9));
    }
}
