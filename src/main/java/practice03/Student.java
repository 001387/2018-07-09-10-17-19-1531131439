package practice03;

public class Student extends Person{

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	private int Klass;
	public int getKlass() {
		return Klass;
	}
	public Student(String name, int age, int klass) {
		super(name, age);
		Klass = klass;
	}
	
	public String introduce() {
		String introduce = "I am a Student. I am at Class "+getKlass()+".";
		return introduce;		
	}
}
