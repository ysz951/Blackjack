package abs.interfa;

public class Square extends Shape{
    public void absMethod() {
        System.out.println("Square abs");
    }

    @Override
    public void regMethod() {
        System.out.println("Square reg");
    }
}
