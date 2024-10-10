package system;

public class ShopManagmentSystem {
	 public static void main(String[] args) {
	        Shop shop = new Shop();
	       Product product1=new Product(123,"bag",435.6,12);
	       Product product2=new Product(321,"watch",788.6,10);
	       
	       shop.addProduct(product2);
	       shop.addProduct(product2);
	       
	       
	       Customer customer1=new Customer("akshay","E123");
	       
	       Customer customer2=new Customer("ajay","E100");
	       
	       shop.addCustomer(customer2);
	       shop.addCustomer(customer1);
	       
	       shop.creatOrder("E12344", customer2);
	   //    shop.addProductOrder(product1);
}
	 
}