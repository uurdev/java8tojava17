package java17;

/**
 * @author ugur.ciftci
 * @since 7.08.2023
 */
public final class Child1 extends Parent {
    public Child1(String name) {
        super(name);
    }

    public void callMethod() {
        super.parentMethod();
    }
}
