package practice08;

import practice07.Klass;

public class Student extends Person{
	public Student(int id,String name, int age) {
		super(id,name, age);
		// TODO Auto-generated constructor stub
	}
	private Klass klass;
		
	public Klass getKlass() {
		return klass;
	}

	public Student(int id,String name, int age, Klass klass) {
		super(id,name, age);
		this.klass = klass;
	}
	
	public String introduce() {
		String introduce =super.introduce()+ " I am a Student. I am at Class "+this.klass.getNumber()+".";
		return introduce;		
	}
}
