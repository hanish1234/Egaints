package order;

public class OrderDetails {
	int orderId;
	String orderName;
	String orderStatus;
	float orderAmount;
	int CV;
		
	//default constructor
	public OrderDetails() {	
	}
	
	//Parameterized constructor
	public OrderDetails(int orderId, String orderName, String orderStatus, float orderAmount) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderStatus = orderStatus;
		this.orderAmount = orderAmount;
	}
	
	public void CartValue(int value) {
		CV = value;
		{
			if(CV >= 1) {
				proceedCheckout();
			}else {
				System.err.println("No items in the cart");
			}
		}
	}
	
	public void proceedCheckout() {
		
		System.out.println("Order ID: "+orderId+ "\nOrder Name: " +orderName+ "\nOrder Status: " +orderStatus+ "\nOrder Amount: " +orderAmount );
		
	}
	
}
	