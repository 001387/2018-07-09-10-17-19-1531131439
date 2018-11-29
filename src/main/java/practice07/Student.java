package practice07;

public class Student extends Person{
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	private Klass klass;
		
	public Klass getKlass() {
		return klass;
	}

	public Student(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}
	
	public String introduce() {
		String introduce =super.introduce()+ " I am a Student. I am at Class "+this.klass.getNumber()+".";
		return introduce;		
	}
}
