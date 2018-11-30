package practice09;

public class Teacher extends Person{
	private Klass klass;
	
	public Teacher(int id,String name, int age) {
		super(id,name, age);
	}	
	
	public Teacher(int id,String name, int age, Klass klass) {
		super(id,name, age);
		this.klass = klass;
	}	
	
	public Klass getKlass() {
		return klass;
	}
			
	public String introduce() {
		String introduce;
		if(null == this.klass)
			introduce = super.introduce() + " I am a Teacher. I teach No Class.";
		else
			introduce = super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
		return introduce;		
	}
	
/*	写一个introduceWith方法，传入一个student，比如Jerry，如果Jerry是Teacher教的班级则返回形如：
	My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.*/
	public String introduceWith(Student s) {
		String introduceWith;
		if (s.getKlass() == this.getKlass()) 
			introduceWith = super.introduce()+" I am a Teacher. I teach "+s.getName()+".";
		else 
			introduceWith = super.introduce()+" I am a Teacher. I don't teach "+s.getName()+".";
		return introduceWith;
	}
}
