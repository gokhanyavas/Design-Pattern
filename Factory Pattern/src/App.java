/**
 * Created by gokhanyavas on 29.04.2017.
 */
public class App {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Daire seklini cizmek icin yontemi cagiriyoruz
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // daireyi ciziyoruz.
        shape1.draw();

        // Dikdörtgen seklini cizmek icin yontemi cagiriyoruz
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // Dikdörtgeni ciziyoruz.
        shape2.draw();

        // Kare seklini cizmek icin yontemi cagiriyoruz
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // Kareyi ciziyoruz.
        shape3.draw();
    }
}
