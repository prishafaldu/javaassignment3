interface TestInterface {
public void func();
default void show() {
System.out.println("Default Method Executed");
}
}
public class InterfaceDefault implements TestInterface {
public void func() {
System.out.println("Implemented method Excecuted");
}
public static void main(String args[]) {
InterfaceDefault d = new InterfaceDefault();
d.func();
d.show();
}
}