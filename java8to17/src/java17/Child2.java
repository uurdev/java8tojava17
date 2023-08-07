package java17;

/**
 * @author ugur.ciftci
 * @since 7.08.2023
 */
public final class Child2 extends Parent {
    Child2(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Child2 obj = new Child2("uurdev");
        obj.parentMethod();
    }
}
