package practice06;

public class Teacher extends Person{
	
	private int klass;
	public int getKlass() {
		return klass;
	}
	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}
		
	public Teacher(String name, int age) {
		super(name, age);
	}
	
	public String introduce() {
		String introduce;
		if(0 == this.klass)
			introduce = super.introduce()+" I am a Teacher. I teach No Class.";
		else
			introduce = super.introduce()+" I am a Teacher. I teach Class "+getKlass()+".";
		return introduce;		
	}
}
