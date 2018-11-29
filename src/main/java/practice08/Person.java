package practice08;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		getId();
	}
	public String introduce() {
		String introduce = "My name is "+getName()+". I am "+getAge()+" years old.";
		return introduce;
	}
}
