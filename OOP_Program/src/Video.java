
public class Video {
	private String title;
	private boolean checkedOut = false;
	private double averageRateing;
	private int ratingSum = 0, ratingCount = 0;

	public void setTitle(String iTitle) {
		title = iTitle;
	}

	public String getTitle() {
		return title;
	}

	public void addRating(int rate) {
		ratingSum += rate;
		ratingCount++;
		averageRateing = ratingSum / ratingCount;
	}

	public double getRating() {
		return averageRateing;
	}

	public void checkOut() {
		checkedOut = true;
	}

	public void returnToStore() {
		checkedOut = false;
	}
	
	public boolean isCheckedOut() {
		return checkedOut;
	}

}
