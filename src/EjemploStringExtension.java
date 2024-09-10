public class EjemploStringExtension {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.pdff";
        int i = archivo.lastIndexOf(".");
        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));
        //toCharArray, arreglo de letras
        String archivo1 = "alguna_imagen.pdff";

        char[] caracteres = archivo1.toCharArray();

        for(int a = 0; a < caracteres.length; a++){
            System.out.println(caracteres[a]);
        }

    }
}
