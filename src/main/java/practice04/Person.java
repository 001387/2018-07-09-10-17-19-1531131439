package practice04;

public class Person {
/*	写一个Person类，要有name，age属性，要有一个introduce方法， introduce方法返回一个字符串形如：
	My name is Tom. I am 21 years old.*/
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String introduce() {
		//不用getName（）的方法，用name、age也可以测试通过是为什么
		String introduce = "My name is "+getName()+". I am "+getAge()+" years old.";
		return introduce;
	}
}
