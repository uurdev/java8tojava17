package java12;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public class StringTransformExample {
    /*
    String ifadeye method reference ile lambda metodu uygular.
     */

    public static void main(String[] args) {
        var value = "    100";
        System.out.println(value);
        System.out.println(value.getClass());
        var myInt = value.strip().transform(Integer::parseInt);
        System.out.println(myInt);
        System.out.println(myInt.getClass());
    }
}
