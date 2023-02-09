
public class FictionBook implements Author2, Book2 {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;

	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}

	public void setAuthorName(String name) {
		author_name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean checkFormatName() {
		author_name = author_name.trim();
		String[] name = author_name.split(" ");
		if (name.length == 2)
			return true;
		else
			return false;
	}

	public String getLastName() {
		String[] name = author_name.split(" ");
		return name[1].toUpperCase();
	}

	public String getFirstName() {
		String[] name = author_name.split(" ");
		return name[0].toUpperCase();
	}

	public boolean checkEmail() {
		if (email.endsWith("@hotmail.com") || (email.endsWith("@windowslive.com")))
			return true;
		else
			return false;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public int totalPublicYear() {
		return 2023 - publicYear;
	}

	public String toString() {
		return getTitle() + " write by " + getLastName().charAt(0) + "." + getFirstName() + " (" + email
				+ ")\nPublished for " + totalPublicYear() + " years.";
	}

}
