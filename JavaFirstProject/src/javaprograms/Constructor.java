package javaprograms;

public class Constructor {
	Constructor(){
		this(2,3);
		System.out.println("Constructor is invoked");
	}
	Constructor(int a,int b){
		//this();
		System.out.println("Parameterized Constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor();
	
	}

}
