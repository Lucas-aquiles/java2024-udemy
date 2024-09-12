public class SentenciaIfElse {

    public static void main(String[] args) {

        float promedio = 6.4f;

        if(promedio >=6.5){
            System.out.println("Felicitaciones,excelente promedio");
        }else{
            System.out.println("Vamos q podemos");
        }

        String[] nombres ={"Andres","Pepe","Marta"};
        int count = nombres.length;
        for(int i= 0; i<count;i++){
            System.out.println(i + " " + nombres[i]);
        }




    }
}
