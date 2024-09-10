import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese nombre de la factura");
        String facturaString = scanner.nextLine();

        Scanner scannerNum1 = new Scanner(System.in);
        System.out.println("ingrese el primer precio");
        Double num1 = scanner.nextDouble();

        Scanner scannerNum2 = new Scanner(System.in);
        System.out.println("ingrese el segundo precio");
        Double num2 = scanner.nextDouble();

        double total ;
        total = num1 + num2;
        double total1 = Math.round(total * 100.0)/100.0;
        double iva = Math.round(((total * 19 /100)*100.0)/100.0);
        double totalIva = total1 + iva;


        System.out.println("La factura " +  facturaString +" tiene un total bruto de " + total1 +", con un impuesto de 19 y el monto después de impuesto es de "+totalIva +"\n" +
                "\n");



    }
}
