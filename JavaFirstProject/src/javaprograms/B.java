package javaprograms;

public class B {
	void m() {
		System.out.println("Java is a programming language");
	}
void n() {
	System.out.println("Java is a high level language");
	m();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
obj.n();
	}

}
