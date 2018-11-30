package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
	private LinkedList<Klass> classes; 
	
	public Teacher(int id,String name, int age) {
		super(id,name, age);
	}	
	
	public Teacher(int id,String name, int age, LinkedList<Klass> classes) {
		super(id,name, age);
		this.classes = classes;
		for (Klass klass : classes) {
			klass.setTeacher(this);
		}
	}	
			
	public LinkedList<Klass> getClasses() {
		return classes;
	}

	public String introduce() {
		String introduce;
		if(null == this.classes)
			introduce = super.introduce() + " I am a Teacher. I teach No Class.";
		else {
			String k = "";
			for (Klass klass : classes) {
				if(klass == classes.getLast()) {
					k = k + klass.getNumber();
				}
				else {
					k = k + klass.getNumber() + ", ";
				}
			}
			introduce = super.introduce() + " I am a Teacher. I teach Class " + k + ".";
		}
		return introduce;		
	}
	
	public boolean isTeaching(Student student) {
		boolean bool = false;
		for (Klass klass : classes) {
			if(klass.isIn(student)) {
				bool = true;
				break;
			}
		}
		return bool;
	}
/*	写一个introduceWith方法，传入一个student，比如Jerry，如果Jerry是Teacher教的班级则返回形如：
	My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.*/
	public String introduceWith(Student student) {
		String introduceWith = null;
		for (Klass klass : classes) {
			if(klass.isIn(student)) {
				introduceWith = super.introduce()+" I am a Teacher. I teach " + student.getName() + ".";				
			}
			else {
				introduceWith = super.introduce()+" I am a Teacher. I don't teach " + student.getName() + ".";
			}
		}
		return introduceWith;
	}
	
/*	public void teacherPrint(Student student) {
		for (Klass klass : classes) {
			if(klass.isIn(student)) {
				System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + klass.getNumber() + ".\n");
			}
		}
		System.out.print("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class " + this.getName() + ".\n");
	}*/
}
