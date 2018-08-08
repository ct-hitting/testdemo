package reflect;

public class ReflectServiceImpl {

    private String name;

    public ReflectServiceImpl(){

    }

    public void sayHello(String name){
        System.err.println("hello "+name);
    }
    public int Calsomething(int a,int b){
        int temp = a+b;
        return temp;
    }
}
