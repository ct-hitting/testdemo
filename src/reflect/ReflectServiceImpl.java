package reflect;

public class ReflectServiceImpl {

    private String name;

    public ReflectServiceImpl(String name){
        this.name = name;
    }

    public void sayHello(){
        System.err.println("hello "+name);
    }
}
