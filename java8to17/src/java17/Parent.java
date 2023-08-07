package java17;

/**
 * @author ugur.ciftci
 * @since 7.08.2023
 */
public sealed class Parent permits Child1, Child2 {
    private String name;

    Parent(String name) {
        this.name = name;
    }

    void parentMethod() {
        System.out.println(name + " from a sealed parent class ");
    }
}
