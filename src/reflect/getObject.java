package reflect;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getObject {
    static ReflectServiceImpl reflectService = null;

    public Object reflectMethod(){
        ReflectServiceImpl object = null;
        try{
            object = (ReflectServiceImpl)Class.forName("reflect.ReflectServiceImpl").newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object,"ctwudi");
        }catch (InstantiationException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException ex){
            ex.printStackTrace();
        }
        return object;
    }
    public static void main(String[] args){
        getObject geto = new getObject();
        geto.reflectMethod();
    }
}
