package pack1;

public class Employee {

	String name, surname, gender, languages, adress, city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display(){
		
		System.out.println(this.getName()+" "+this.getSurname());
		System.out.println(this.getGender());
		System.out.println(this.getLanguages());
		System.out.println(this.getCity());
		System.out.println(this.getAdress());
		
	}
	
	
}
