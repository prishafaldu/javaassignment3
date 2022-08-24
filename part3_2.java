/*
21ce028
prisha faldu
import java.util.Vector; interface iprinter{ String ip(); default void show() {
System.out.println("Default iprinter"); } } interface iscanner{ String isc(); default void
show() { System.out.println("Default testinterface2"); } } class defaultmethod implements
iprinter,iscanner { @Override public String ip() { return "iprinter"; } @Override public
String isc() { return "iscanner"; } public void show() { iprinter.super.show();
iscanner.super.show(); } } public class Practical_2 { public static void main(String[] args)
{ Vector<String> s = new Vector<>(); defaultmethod d = new defaultmethod(); s.add(d.ip());
s.add(d.isc()); s.add(d.ip()); s.add(d.isc()); s.add(d.ip()); d.show(); for (int i = 0; i <
s.size(); i++) { System.out.println(s.get(i)); } } } */
import java.util.Vector;
interface iprinter {
String iprinter();
default void show() {
System.out.println("Default iprinter");
}
}
interface iscanner {
String iscanner();
default void show() {
System.out.println("Default testinterface2");
}
}
class defaultmethod implements iprinter, iscanner {
@Override
public String iprinter() {
return "iprinter";
}
@Override
public String iscanner() {
return "iscanner";
}
public void show() {
iprinter.super.show();
iscanner.super.show();
}
}
public class code_2 {
public static void main(String[] args) {
Vector<String> s = new Vector<>();
defaultmethod a = new defaultmethod();
s.add(a.iprinter());
s.add(a.iscanner());
s.add(a.iprinter());
s.add(a.iscanner());
s.add(a.iprinter());
a.show();
for (int i = 0; i < s.size(); i++) {
System.out.println(s.get(i));
}
}
}
