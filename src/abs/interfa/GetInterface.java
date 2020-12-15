package abs.interfa;

public class GetInterface implements FatherInterface{
    public void show() {
        System.out.println(name);
    }
    private String name;
    public GetInterface(String name) {
        this.name = name;
    }
    public void getInt(){
        System.out.println("getInt");
    }
}
