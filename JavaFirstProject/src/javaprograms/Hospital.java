package javaprograms;

public class Hospital {
	int Staffnumber;
	static String hospitalname="Credence";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hospital obj=new Hospital();
obj.Staffnumber=500;
obj.display();

	}
	public void display() {
		System.out.println("Number of staffs in "+ hospitalname+ "="+Staffnumber);
		
	}

}
