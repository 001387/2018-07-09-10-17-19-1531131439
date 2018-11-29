package practice08;

public class Klass {
	private int number;
	private String leader;
	
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
