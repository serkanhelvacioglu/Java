package Pack4;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewPlayer player1=new NewPlayer("Lionel","Messi",1988,"Left");
		
		player1.setPosition("Forward");
		player1.setFootballClub("Barcelona");
		
		player1.show();

	}

}
