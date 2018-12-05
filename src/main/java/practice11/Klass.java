package practice11;

public class Klass {
	private int number;
	private Student leader;
	private Teacher teacher;

	public Teacher getTeacher(){
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

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
		if (s.getKlass().number != this.number) {
			System.out.print("It is not one of us.\n");
		}
		leader = s;
		if (null != this.getTeacher()) {
			if (s.getKlass().number == this.number) {
				System.out.print("I am " + this.getTeacher().getName() + ". I know " + s.getName()
						+ " become Leader of Class " + this.getNumber() + ".\n");
			}
		}
	}

	/*
	 * Klass还有一个appendMember方法，接受一个Student实例。意味将一名学生加入该班级。
	 * 如果学生没有加入该班级，那么在调用assignLeader方法的时候，不会assign成功，会打印一句话： It is not one of us.
	 * 相应的调用Student的introduce方法也只会返回旧的字符串。
	 */

	public void appendMember(Student student) {
//		student.getKlass().number = getNumber();
		student.setKlass(this);
		if (null != this.getTeacher()) {
			System.out.print("I am " + this.getTeacher().getName() + ". I know " + student.getName()
					+ " has joined Class " + this.getNumber() + ".\n");
		}
//		this.getTeacher().teacherPrint(student);
	}

	public boolean isIn(Student student) {
		return student.getKlass().getNumber() == this.number;
	}

	public String getDisplayName() {
		return "Class " + this.getNumber();
	}
}
