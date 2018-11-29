package practice07;

public class Klass {
	private int number;
	
	public int getNumber() {
		return number;
	}

	public Klass(int number) {
		this.number = number;
	}
	public String getDisplayName() {
		String DisplayName = "Class "+this.getNumber();
		return DisplayName;
		
	}
	
}
