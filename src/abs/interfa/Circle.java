package abs.interfa;

public class Circle extends Shape{

    @Override
    public void area() {
        System.out.println(width * 6);
    }
    private int width;
    public Circle(int width) {

        this.width = width;
    }
    public void cirMethod() {
    }
}
