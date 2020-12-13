package abs.interfa;

public class Animal {
    String name;
    int lifeExpentency;
    public Animal(String name,int lifeExpentency ){
        this.name = name;
        this.lifeExpentency=lifeExpentency;
    }
    public void remember(){
        System.out.println("Define your own remember");
    }
    public void protectOwner(){
        System.out.println("Define your own protectOwner");
    }

    protected void print() {
        System.out.println(name);
    }
    public String toString(){
        return this.getClass().getSimpleName()+":"+name+":"+lifeExpentency;
    }
}
