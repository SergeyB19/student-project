package Interface;

public class Starter {
    public static void main(String[] args) {
        Interface.MyClass1 mc1 = new Interface.MyClass1();
        mc1.sayHello();
        mc1.sayHi();
        Interface.Myinterface1.sayStatic();
        Interface.MyClass2 mc2 = new Interface.MyClass2();
        mc2.sayHi();
        Interface.MyClass3 mc3 = new Interface.MyClass3();
        mc3.sayHi();
    }
}
