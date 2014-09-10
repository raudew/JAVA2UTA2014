
public abstract class Product {
	String title;
	private double price;
	private Date purchaseDate;

	public Product(String title, double price, Date purchaseDate) {
		setTitle(title);
		setPrice(price);
		setPurchaseDate(purchaseDate);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String toString() {
		return title+ "" +"$"+price +purchaseDate;
	}
}
