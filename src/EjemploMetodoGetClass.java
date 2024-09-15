import java.lang.reflect.Method;
public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto= "Hola que tal";
        Class strClass = texto.getClass();

        System.out.println(strClass.getName());
        System.out.println(strClass.getSimpleName());

        //reflexion ver la estructura interna de los objetos
        for (Method metodo : strClass.getMethods()) {
            System.out.println(metodo.getName());
        }

    }
}
