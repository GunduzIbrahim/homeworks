package homework12_8;

public class Test08 {
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		y.m2(); // m2, Y class
		x.m1(); // m1, X class
		y.m1(); // m1, Y class
		x=y;
		x.m1(); // m1, Y class
	}

}
class X{
	public void m1() {
		System.out.println("m1, X class");
	}
}
class Y extends X{
	public void m1() {
		System.out.println("m1, Y class");
	}
	public void m2() {
		System.out.println("m2, Y class");
	}
}