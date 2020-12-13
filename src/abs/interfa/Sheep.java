package abs.interfa;

public class Sheep extends Animal implements Climb{
    public Sheep(String name,int age){
        super(name,age);
    }
    @Override
    protected void print() {
        System.out.println(name);
    }

    @Override
    public void climb() {
        System.out.println(name + " climb");
    }
}
