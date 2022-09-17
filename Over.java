//prisha faldu(21ce028)

class Over {
void func() {
System.out.println("This is parent class");
}
}
public class OverRiding extends Over {
void func() {
System.out.println("This is child class");
}
public static void main(String[] args) {
Over b = new OverRiding();
b.func();
Over p = new Over();
p.func();
}
}