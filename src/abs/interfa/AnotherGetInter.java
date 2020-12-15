package abs.interfa;

public class AnotherGetInter implements FatherInterface{
    private String name;
    public AnotherGetInter(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println(name);
    }

}
