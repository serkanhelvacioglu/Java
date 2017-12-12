package pack1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Enrollment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu1=new Student("Mark","Walker","Computing");
		Student stu4=new Student("Eric","Wall","Computing");
		Student stu3=new Student("Nick","Berry","Literature");
		Student stu2=new Student("Jane","Lui","Business");

		
		HashMap stu_hmap=new HashMap<Integer,Student>();
		stu_hmap.put(1,stu1);
		stu_hmap.put(2,stu2);
		stu_hmap.put(3,stu3);
		stu_hmap.put(4,stu4);
		
		Set set_stu=stu_hmap.entrySet();
		Iterator iter_stu=set_stu.iterator();
		
		Student student;
		while(iter_stu.hasNext())
		{
			Map.Entry student_entry=(Entry) iter_stu.next();
			
			student=(Student) student_entry.getValue();
			System.out.println(student_entry.getKey()+" "+student.name+" "+
								student.Surname+" "+student.Department);
			
		}
			
		}
	}


