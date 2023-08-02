package java11;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public class StringStripExample {
    public static void main(String[] args) {
        String str
                = "        Smartera Java Versiyonlar arası yenilikler sunumu    !   ";

        System.out.println("---- Strip ---");
        System.out.println(str.strip());

        System.out.println("--- Repeat -----");
        System.out.println(str.repeat(3));
    }
}
