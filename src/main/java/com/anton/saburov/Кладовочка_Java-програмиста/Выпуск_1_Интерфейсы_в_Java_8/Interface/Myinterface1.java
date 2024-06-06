package Interface;

public interface Myinterface1 {
    void sayHello();

    default void sayHi() {
        System.out.println("HI 1");
    }

    static void sayStatic() {
        System.out.println("Static");
    }
}
