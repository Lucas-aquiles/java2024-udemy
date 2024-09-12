public class SentenciasBucleEtiquetasBuscar {

    public static void main(String[] args) {
        String frase = " tres triste tigres comiendo en un trigalt";
        int max = frase.length();
        int cantidad = 0;

        for(int i = 0;i<max; i++){
            if(frase.charAt(i) != 't'){
                continue;
            }
            cantidad ++;
        }
        System.out.println("encontrado : " + cantidad);
    }
}
