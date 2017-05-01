/**
 * Created by gokhanyavas on 1.05.2017.
 */
public class Mouse extends ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
