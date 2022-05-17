package entities;

public class Product {
	
	private String name;
	
	private Double price;
	private double oldPrice;
	
	public Product(String name, Double price, double oldPrice) {
		this.name = name;
		this.price = price;
		this.oldPrice = oldPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", oldPrice=" + oldPrice + "]";
	}
}