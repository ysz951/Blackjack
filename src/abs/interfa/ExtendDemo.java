package abs.interfa;

public class ExtendDemo {
    public static void main(String[] args) {
        Animal a = new Animal("animal", 12);
        a.print();

        Animal b = new Sheep("animal", 12);
        b.print();

        Sheep s = new Sheep("animal", 12);
        s.climb();
//        b.climb();
        Climb c = new Sheep("animal", 12);
        c.climb();


    }
}
