package javaprograms;

public class Doctor extends Hospital{
	int doctorsnumber=100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doctor obj=new Doctor();

obj.display();

	}
public void display() {
	System.out.println("Number of Doctors in"+hospitalname+"="+doctorsnumber);
	
}

}
