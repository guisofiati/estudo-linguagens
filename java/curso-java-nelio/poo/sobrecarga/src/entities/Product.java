package entities;

public class Product {
	
	// Auto-generate construtor no eclipse: Alt + Shift + S
	
	public String name;
	public double price;
	public int quantity;
	
	// Construtor padrao
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//quantity = 0; -> Opcional
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unit(s), Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}