package practice11;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.getId() == this.id) {
				return true;
			}
		}
		return false;
	}

	public String introduce() {
//		String introduce = "My name is "+getName()+". I am "+getAge()+" years old.";
//		return introduce;
		String msgTemplate = "My name is %s. I am %s years old.";
		return String.format(msgTemplate, getName(),getAge());
	}
}
