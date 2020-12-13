package abs.interfa;

public class GrandToChildDemo {
    public static void main(String[] args) {
        GrandFather gf = new Child();
        Father f = new Child();
        Child c = new Child();
        f.Father();
        f.print();

    }
}
