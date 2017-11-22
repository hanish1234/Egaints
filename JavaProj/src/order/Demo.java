package order;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OrderDetails orderDetails1 = new OrderDetails(111, "amazon", "confirmed", 300);
			orderDetails1.CartValue(0);
			System.out.println();
			
			ShippingDetails sd = new ShippingDetails(123, "ebay", "confirmed", 450, 50);
			float finalCost = sd.orderAmount + sd.shippingRate;
			sd.CartValue(2);
			System.out.println("Shipping Cost: " +sd.shippingRate+ "\nFinal Cost: "+finalCost);
			}
}