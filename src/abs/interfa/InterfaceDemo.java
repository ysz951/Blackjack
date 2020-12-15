package abs.interfa;

public class InterfaceDemo {
    public static void main(String[] args) {
        FatherInterface ge = new GetInterface("Get");
        FatherInterface an = new AnotherGetInter("Another");
        ge.show();
        an.show();
    }
}
