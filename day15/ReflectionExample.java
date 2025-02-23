import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class Example {
    private String message = "Hello, Reflection!";
    
    public void display() {
        System.out.println(message);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
           
            Class<?> obj = Class.forName("Example");

           
            Constructor<?>[] constructors = obj.getConstructors();
            System.out.println("Constructors: " + constructors.length);

            
            Method[] methods = obj.getMethods();
            System.out.println("Methods: ");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            
            Field[] fields = obj.getDeclaredFields();
            System.out.println("Fields: ");
            for (Field field : fields) {
                System.out.println(field.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
