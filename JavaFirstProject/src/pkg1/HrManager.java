package pkg1;

public class HrManager extends Manager{
	int ta=4000;
	int salary=basicpay+hra+ta;
	public static void main(String args[]) {
		HrManager obj=new HrManager();
		obj.display();
	}

public void display() {


System.out.println(salary);
	}

}
