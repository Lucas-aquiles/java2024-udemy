public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres";

        String resultado = curso.concat(profesor);

        String resultado2 = curso.transform( c->{
            return c + " con " + profesor;
        });
        System.out.println(resultado2);

        String resultado3 = resultado.replace("a","A");

        System.out.println(resultado3);
    }
}
