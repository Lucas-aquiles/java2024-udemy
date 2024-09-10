import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        String numeroString = scanner.nextLine();
        int numeroDecimal= 0;
        try{
            numeroDecimal = Integer.parseInt(numeroString);

        }catch (NumberFormatException error){
            main(args);
            System.exit(0);
        }

        String mensaje = "numeroBinario = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumeroDecimal  = " + numeroDecimal;
        System.out.println("mensaje es = " + mensaje);
    }
}
