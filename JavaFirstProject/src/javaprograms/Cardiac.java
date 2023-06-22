package javaprograms;

public class Cardiac extends Doctor{
int cardiacnumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cardiac obj=new Cardiac();
	obj.cardiacnumber=10;
obj.display();
	}
public void display() {
	System.out.println("Number of cardiac doctors among " + doctorsnumber + " in " + hospitalname + "=" + cardiacnumber );

}
}
