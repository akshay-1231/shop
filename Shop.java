package system;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InsufficientResourcesException;

public class Shop {
 private List<Product> products=new ArrayList<>();
 private List<Customer>customers=new ArrayList<>();
 
 
 public void addProduct(Product product) {
	 products.add(product);
	 
 }
 public void addCustomer(Customer customer) {
	 customers.add(customer);
	 
 }
 public void creatOrder(String orderId,Customer customer)throws InsufficientResourcesException {
     if (orders.containsKey(orderId)) {
         throw new InvalidOrderException("Order ID " + orderId + " already exists.");
     }
     Order order = new Order(orderId, customer);
     orders.put(orderId, order);
     System.out.println("Order created for customer: " + customer.getName());
 }

 
}
