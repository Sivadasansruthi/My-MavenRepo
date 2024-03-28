package mypackage;

public class Student {
	
	 String str;
	 int no;
	public Student(String name,int rollno)
	{
		str=name;
       no=rollno;
	}
	public void display()
	{
	System.out.println("Name is: "+str+" Age is: "+no);
	}

	public static void main(String[] args) {
		
		Student s=new Student("Sruthi",5);
		s.display();

	}

}
