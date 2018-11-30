package practice09;

public class Klass {
	private int number;
	private Student leader;
	
	public Klass(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public Student getLeader() {
		return leader;
	}

	public void assignLeader(Student s) {
		if(s.getKlass().number == this.number) {
			leader = s;
		}
		else {
			System.out.print("It is not one of us.\n");
		}
	}
	
/*	Klass还有一个appendMember方法，接受一个Student实例。意味将一名学生加入该班级。 如果学生没有加入该班级，那么在调用assignLeader方法的时候，不会assign成功，会打印一句话：
	It is not one of us.
	相应的调用Student的introduce方法也只会返回旧的字符串。*/

	public void appendMember(Student s) {
		s.getKlass().number = getNumber();	
	}
	
	public String getDisplayName() {
		return  "Class " + this.getNumber();
	}
}
