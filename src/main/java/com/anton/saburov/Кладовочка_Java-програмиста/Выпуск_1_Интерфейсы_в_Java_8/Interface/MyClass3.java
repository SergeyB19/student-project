package Interface;

public class MyClass3 implements Interface.Myinterface1, Interface.Myinterface2 {
    @Override
    public void sayHello() {

    }

    @Override
    public void sayHi() {
        System.out.println("HI Class");
    }
}
