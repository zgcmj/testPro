package reflex;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class ClassDemo {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> aClass = Class.forName("reflex.ImportFile");

        String name = aClass.getName();
        System.out.println(name);

        ImportFile importFile = (ImportFile) aClass.newInstance();
        Method[] methods = aClass.getMethods();
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
        }
        //Method getId = aClass.getMethod("getId");
        //getId.invoke(importFile);
        //String name2 = getId.getName();
        //System.out.println(name2);


        //for (Method method : methods) {
        //    String name1 = method.getName();
        //    System.out.println(name1);
        //}

    }
}
