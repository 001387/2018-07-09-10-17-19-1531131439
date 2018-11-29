package practice02;

public class Student extends Person{
	
	private int klass;
	
	public Student(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}

	public int getKlass() {
		return klass;
	}

	@Override
	public  String introduce() {
		// TODO Auto-generated method stub
		String introduce = "I am a Student. I am at Class "+getKlass()+".";
		return introduce;
	}
}
