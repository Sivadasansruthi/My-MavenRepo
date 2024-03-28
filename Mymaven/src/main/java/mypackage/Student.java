package mypackage;

public class Student {
	
	String name;
	int rollno;
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void display()
	{
	System.out.println("Name is: "+name+" Age is: "+rollno);
	}

	public static void main(String[] args) {
		
		Student s=new Student("Sruthi",36);
		Student.display();

	}

}
