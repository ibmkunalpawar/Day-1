
public class Developer extends Employee{
	public static void main(String[] args) {
		new A().m1();
	}
}
class A{
	void m1() {
		System.out.println("A");
	}
	void m2() {
		System.out.println("A");
		throw new RuntimeException();
	}
}