package pack1;

import javax.swing.JOptionPane;

public class Student {

	int number;
	String name, surname,department;
	
	void register(Student s)
	{
		s.number=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
		s.name=JOptionPane.showInputDialog(null,"Enter Name");
		s.surname=JOptionPane.showInputDialog(null,"Enter Surname");
		s.department=JOptionPane.showInputDialog(null,"Enter Department");
		
		
		
	}
	void display(Student s)
	{
		JOptionPane.showMessageDialog(null, s.number+"\n"+s.name+" "+s.surname+"\n"+s.department);
		
	}
	
	public static void main(String[] args) {
		
		
		Student stu1=new Student();
		
		stu1.register(stu1);
		stu1.display(stu1);
		
		Student stu2=new Student();
		stu2.register(stu2);
		stu2.display(stu2);

		
		stu1.display(stu1);
	}

}
