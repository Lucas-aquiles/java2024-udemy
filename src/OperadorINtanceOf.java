public class OperadorINtanceOf {
    public static void main(String[] args) {
        //insteof si es descendiente de esa clase o objeto
        String texto = "hello";
        Integer num = 7;
        //Object, toda clase herada del tipo Object
        boolean b1 = texto instanceof String;
        System.out.println(b1);
    }
}
