package abs.interfa;

public class Square extends Shape{
    @Override
    public void area() {
        System.out.println(width * width);
    }
    private int width;
    public Square(int width) {
        this.width = width;
    }
    @Override
    public void regMethod() {
        System.out.println("Square reg");
    }
}
