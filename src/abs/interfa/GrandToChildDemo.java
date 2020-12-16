package abs.interfa;

public class GrandToChildDemo {
    public static void main(String[] args) {
        GrandFather gf = new Child();
        Father f = new Child();
        Child c = new Child();
        GrandFather agf = new AnoterChild();
        gf.print();
        gf.GrandFa();

        agf.print();

        f.print();
        f.GrandFa();
        f.Father();

        c.child();
        c.Father();
        c.GrandFa();
        c.callGran();
    }
}
