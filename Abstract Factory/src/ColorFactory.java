/**
 * Created by gokhanyavas on 29.04.2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
