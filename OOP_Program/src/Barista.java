
public class Barista {
	private String name;
	private char gender;

	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public Barista() {
		name = "";
		gender = ' ';
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenderName() {
		return gender=='M'?"Male":gender=='F'?"Female":" ";
	}

}
