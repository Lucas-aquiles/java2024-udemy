public class WrapperInteger {

    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2= intPrimitivo;

        int num = intObjeto2;
        int num2= intObjeto2.intValue();

    }
}
