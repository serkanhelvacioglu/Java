package Pack2;

public class CreateSTU {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Student stu1=new Student(1,"Mark","Walker",22);
			stu1.setDepartment("Computing");
			stu1.setSection(2);
			stu1.setGrades(80,75,90);

			
			stu1.display();
	}

}
