package Pack2;

public class Student extends RegisterSTU implements IAcademicID, IGrades {
	int stuNumber;
	
	public Student(int stuNumber, String name, String surname, int age)
	{
		super(name,surname,age);
		this.stuNumber=stuNumber;
	}

	public void setGrades(int quiz, int midTerm, int Final) {
		this.Quiz=quiz;
		this.MidTerm=midTerm;
		this.Final=Final;
		
	}

	public double CalculateAverage() {
		
		return ((this.Quiz*0.1)+(this.MidTerm*0.3)+(this.Final*0.6));
	}

	public void getGrades() {
		
		System.out.println("Quiz: "+this.Quiz);
		System.out.println("Mid Term: "+this.MidTerm);
		System.out.println("Final: "+this.Final);
		System.out.println("Average: "+this.CalculateAverage());
	}

	public void setDepartment(String department) {
		this.department=department;
		
	}

	public void setSection(int section) {
		this.section=section;
		
	}

	public void getAcademicID() {
		System.out.println("Department: "+this.department);
		System.out.println("Section: "+this.section);
	}

	public void display() {
		System.out.println("Name & Surname: "+this.name+" "+this.surname);
		System.out.println("Age: "+this.age);
		this.getAcademicID();
		this.getGrades();
		
	}

}
