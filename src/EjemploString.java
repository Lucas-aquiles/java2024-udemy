public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso == curso2;
        System.out.println("es Igual = " + esIgual);
//  se compora el valor del objeto
        esIgual = curso.equals(curso2);
        System.out.println("es Igual = " + esIgual);

        //asigna la misma referencia cuando detecta el mismo valor

        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("esigual = " + esIgual);


        String curso1 ="hola";
        String profesor= "Jose";

        String detalle = curso1 + " con el instructor " + profesor;
        String detalle2 = curso1.concat(" ").concat(profesor);
        System.out.println(detalle2);



    }
}
