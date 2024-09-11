import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

//por refenrecia, se guardan dos espacios para guardar en el arreglo
        String[] usernames = new String[2];
        String[] password = new String[2];

        usernames[0]= "andres";
        usernames[1]= "admin";

        password[0] ="12345";
        password[1]="12345";
        //otra forma
        // String[] usernames = {"andres","admin","pepe"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();


        boolean esAutenticado = false;

        for( int i =0; i< usernames.length;i++){
            if((usernames[i].equals(u) && password[i].equals(p)) ){
                esAutenticado= true;
                System.out.println("encontrado");
                break;
            }else{
                System.out.println("username o contraseña incorrecto");
            }
        }



    }
}
