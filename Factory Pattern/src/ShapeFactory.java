/**
 * Created by gokhanyavas on 29.04.2017.
 */
public class ShapeFactory {
    // Nesnenin seklini almak icin getShape kullaniyoruz.
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
