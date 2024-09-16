import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        Date fecha= calendario.getTime();
        System.out.println(fecha);
    }
}
