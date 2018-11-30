package practice08;

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

	public Student assignLeader(Student s) {
		return leader = s;
	}
	
	public String getDisplayName() {
		return  "Class " + this.getNumber();
	}
}
