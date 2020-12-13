package abs.interfa;

public class AbsDemo {
    public static void main(String[] args) {
        Shape shape = new Square();
        Square square = new Square();
        shape.absMethod();
        shape.regMethod();

        square.absMethod();
        square.regMethod();

        Shape sc = new Circle();
        sc.regMethod();
        sc.absMethod();

        Circle cc = new Circle();
        cc.regMethod();
        cc.absMethod();

    }
}
