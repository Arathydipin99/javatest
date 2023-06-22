package pkg1;

public class Programmer extends Employee {
int bonus=3000;
int salary=basicpay+bonus;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer obj=new Programmer();
		obj.display();
		}

	
	public void display() {
		System.out.println(salary);
		
	}
	

}
