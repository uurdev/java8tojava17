package java12;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public class StringIndentExample {
    /*
    String ifadeye girinti verir ve ifadenin sonuna \n ekler.
     */
    public static void main(String[] args) {
        var myName = "  Smartera\n java versiyon sunum kodları";
        System.out.println(myName);
        System.out.print(myName.indent(1));
        System.out.print(myName.indent(-1));
    }
}
