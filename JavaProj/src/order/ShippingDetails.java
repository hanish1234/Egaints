package order;

public class ShippingDetails extends OrderDetails {
	float shippingRate = 20.5f;

	public ShippingDetails(int orderId, String orderName, String orderStatus, float orderAmount, float shippingRate) {
		super(orderId, orderName, orderStatus, orderAmount);
		this.shippingRate = shippingRate;
	}

}
