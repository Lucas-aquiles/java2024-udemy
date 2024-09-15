import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println(fecha);

        SimpleDateFormat dif = new SimpleDateFormat("dd MMMM,yyyy");
        String fechaStr = dif.format(fecha);
        System.out.println(fechaStr);
    }
}
