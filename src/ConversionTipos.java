public class ConversionTipos {
    public static void main(String[] args) {
        String numeroString = "50";

        int numero = Integer.parseInt(numeroString);
        System.out.println("numero convertido = " + numero);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt );


        String otronumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr =  " + otronumeroString);


    }
}
