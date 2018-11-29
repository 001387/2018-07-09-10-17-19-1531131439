package practice04;

public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	/*再写一个Worker类继承Person类，只有name，age属性。也有一个introduce方法， introduce方法返回一个字符串形如：
	My name is Tom. I am 21 years old. I am a Worker. I have a job.*/
	
	public String introduce(){
		String introduce = super.introduce()+" I am a Worker. I have a job.";
		return introduce;
		
	}

}
