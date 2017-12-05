import java.util.ArrayList;
import java.util.Iterator;

public class Book_Enrollment
{

	static ArrayList<Book> book_List=new ArrayList<Book>();
	
	public void createBook()
	{
		Book book=new Book();
		book_List.add(book);
		
	}
	public static void main(String[] args)
	{
		Book_Enrollment obj=new Book_Enrollment();
		
		Iterator iter=book_List.iterator();
		
		Book book;
		
		while(iter.hasNext())
		{
			
			book=(Book)iter.next();
			System.out.println(book.ID+" "+book.title+" "+book.category);
		}
		
	}
}
