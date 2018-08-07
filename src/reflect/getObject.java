package reflect;


import java.lang.reflect.InvocationTargetException;

public class getObject {
    static ReflectServiceImpl reflectService = null;

    public ReflectServiceImpl getInstance(){
        ReflectServiceImpl object = null;
        try{
            object = (ReflectServiceImpl)Class.forName("reflect.ReflectServiceImpl").getConstructor(String.class).newInstance("ct123");
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException ex){
            ex.printStackTrace();
        }
        return object;
    }
    public static void main(String[] args){
        getObject geto = new getObject();
        reflectService = geto.getInstance();
        reflectService.sayHello();
    }
}
