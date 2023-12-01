package homework.week02_03.airport.runner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionRunner {
    private static final String LINE_SEPARATOR = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> classByReflection;
        try {
            classByReflection = Class.forName("homework.week02_03.airport.aircraft.Position");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Class modifier: " + Modifier.toString(classByReflection.getModifiers()));
        System.out.println("Class name: " + classByReflection.getCanonicalName());
        System.out.println(LINE_SEPARATOR);

        Field[] fields = classByReflection.getDeclaredFields();
        System.out.println("Number of fields: " + fields.length);
        for (Field field : fields) {
            System.out.println("Modifier, type and field name: " + field);
        }
        System.out.println(LINE_SEPARATOR);

        Constructor[] constructors = classByReflection.getDeclaredConstructors();
        System.out.println("Number of declared constructors: " + constructors.length);
        System.out.println();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor name: " + constructor);
            System.out.println("Number of constructor parameters : " + constructor.getParameterCount());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Constructor's parameter : " + parameter);
            }
            System.out.println();
        }
        System.out.println(LINE_SEPARATOR);

        Method[] methods = classByReflection.getDeclaredMethods();
        System.out.println("Number of declared methods : " + methods.length);
        System.out.println();
        for (Method method : methods){
            System.out.println("Method name: " + method);
            System.out.println("Method return type: " + method.getReturnType());
            System.out.println("Number of method parameters: " + method.getParameterCount());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Method's parameter: " + parameter);
            }
            System.out.println();
        }
        System.out.println(LINE_SEPARATOR);

        Class[] classes = classByReflection.getDeclaredClasses();
        System.out.println("Number of declared interfaces and enums: " + classes.length);
        for (Class theClass : classes) {
            System.out.println("Class: " + theClass);
            System.out.println("Name of class: " + theClass.getName());
        }
        System.out.println(LINE_SEPARATOR);

        System.out.println("Creating an object, calling methods and printing results");
        Object myObject = constructors[0].newInstance(12.34, 56.78);
        System.out.println(methods[0].getName() + "\t" + methods[0].invoke(myObject, myObject));
        System.out.println(methods[1].getName() + "\t" + methods[1].invoke(myObject));
        System.out.println(methods[2].getName() + "\t" + methods[2].invoke(myObject));
        System.out.println(methods[3].getName() + "\t" + methods[3].invoke(myObject));
        System.out.println(methods[4].getName() + "\t" + methods[4].invoke(myObject));
    }
}
