import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {

            Class clazz = Class.forName("Student");
            Method method = clazz.getDeclaredMethod("getName");
            method.invoke(clazz.newInstance(),null);
            SuppressWarnings a = method.getAnnotation(SuppressWarnings.class);
            System.out.println(a.value());
//            for (Method m : stuM){
////                System.out.println(m.getName()+":  "+m.getAnnotations());
//            }
//            Student stu = (Student) clazz.newInstance();
//            stu.getName();
        int length = 10;
        int[] aaa = new  int[length];
    }
}

