package system;

import javax.naming.InsufficientResourcesException;

public class Order {
	private String orderId;
	private Customer customer;
	private boolean isCompleted;

	public Order(String orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.isCompleted = false;
	}

	public void addProduct(Product product, int quantity)throws InsufficientResourcesException {
		product.reduceStock(quantity) ;{

			items.put(product, quantity);
	
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", isCompleted=" + isCompleted + "]";
	}

	public Order get(String orderId2) {
		// TODO Auto-generated method stub
		return null;
	}



}
