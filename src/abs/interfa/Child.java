package abs.interfa;

public class Child extends Father{
    @Override
    protected void print() {
        System.out.println("child print");
    }
    public void child() {
        System.out.println("child");
    }

    @Override
    public void Father() {
        System.out.println("child father");
    }
}
