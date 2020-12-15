package abs.interfa;

public class AbsDemo {
    public static void main(String[] args) {
        Shape c = new Circle(2);
        Shape s = new Square(2);
        c.area();
        s.area();
        c.regMethod();
        s.regMethod();
    }
}
