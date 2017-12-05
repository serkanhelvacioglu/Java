import javax.swing.JOptionPane;


public class Book {

	int ID, year;
	String title,author,category;
	boolean isAvailable;
	public Book(int ID, int year, String title, String author, String category,
			boolean isAvailable) {
		this.ID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
		this.year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year"));
		this.title = JOptionPane.showInputDialog("Enter Title");
		this.author = JOptionPane.showInputDialog("Enter Author");
		this.category = JOptionPane.showInputDialog("Enter Category");
		this.isAvailable =Boolean.valueOf(JOptionPane.showInputDialog("Is it available?"));
	}

	public Book()
	{
		
	}
	
	}


