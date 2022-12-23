
public class Product {
	public String id;
	public int unit;
	public double price;
	
	public void setId(String ID) {
		id = ID;
	}
	
	public String getId() {
		return id;
	}
	
	public void setUnit(int UNIT) {
		unit = UNIT;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public void setPrice(double PRICE) {
		price=PRICE;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double calculate() {
		return unit*price;
	}
	
	public String chkStatus(int _unit) {
		return (_unit<5)?"low":(_unit>=5&&_unit<50)?"normal":"high";
	}

}
