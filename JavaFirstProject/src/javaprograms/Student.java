package javaprograms;

public class Student {
	String name; int id;

	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student("Arathy", 1);
obj.display();
	}
	void display() {
		System.out.println(name + "\n"+ id);
	}

}
