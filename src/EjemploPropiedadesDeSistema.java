public class EjemploPropiedadesDeSistema {

    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println(username);
        String home = System.getProperty("user.home");
        System.out.println(home);

        String arc = System.getProperty("os.arch");
        System.out.println(arc);

        String dire = System.getProperty("user.dir");
        System.out.println(dire);
    }
}
