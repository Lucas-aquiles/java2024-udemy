import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null,"Ingrese un numero entero");

        int numeroBinario = 0b111110100;
        System.out.println("numero Binario = " + numeroBinario);
        int numeroDecimal= 0;
        try{
            numeroDecimal = Integer.parseInt(numeroString);

        }catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null,"debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "numeroBinario = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumeroDecimal  = " + numeroDecimal;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
