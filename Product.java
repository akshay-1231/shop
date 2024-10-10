package system;

import javax.naming.InsufficientResourcesException;

public class Product {
     private int id;
    private String name;
    private double price;
    private int stock;
	public Product(int id, String name, double price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
    
	public void reduceStock(int quantity) throws InsufficientResourcesException {
		if(stock>=quantity) {
			stock-=quantity;
			
		}else {
			throw new InsufficientResourcesException("not eniugh stock"+name);
			
		}
	}
    
}
