package practice04;

public class Student extends Person{
/*	再写一个Student类继承Person类，除了name，age属性，还有要有klass属性。也有一个introduce方法， introduce方法返回一个字符串形如：
	My name is Tom. I am 21 years old. I am a Student. I am at Class 2.*/
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	private int klass;
	public int getKlass() {
		return klass;
	}
	public Student(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}
	public String introduce() {
		String introduce = super.introduce()+" I am a Student. I am at Class "
						+ klass+".";
		return introduce;
	}
	
}
