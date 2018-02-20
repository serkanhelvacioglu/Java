package Pack4;

public class NewPlayer extends Footballer implements IFootballClub, IPosition {
	String preferredFoot;
	
	public NewPlayer(String name, String surname, int birthYear, String preferredFoot)
	{
		super(name,surname,birthYear);
		this.preferredFoot=preferredFoot;
	}

	public void setPosition(String position) {
		
		this.position=position;
		
	}

	public void getPosition() {
		System.out.println("Position:"+this.position);
		
	}

	public void setFootballClub(String clubname) {
		this.clubname=clubname;
		
	}

	public void getFootballClub() {
		System.out.println("Football Club:"+this.clubname);
		
	}

	public void show() {
		System.out.println("Name & Surname: "+this.name+" "+this.surname);
		System.out.println("Age: "+this.getAge());
		System.out.println("Preferred Foot: "+this.preferredFoot);
		this.getPosition();
		this.getFootballClub();
		this.getPosition();
	}

	public int getAge() {
		
		
		return (2018-this.birthYear);
	}
}
