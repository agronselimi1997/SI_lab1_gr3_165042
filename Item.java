class Item {
	int id;
	String name;
	double price;
	char taxType;
	//TODO add variable.

	public Item(int id, String name, double price, char taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public char getTaxType() {
		return taxType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}
	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		
	}
}