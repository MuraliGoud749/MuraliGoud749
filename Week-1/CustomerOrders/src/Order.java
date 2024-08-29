
public class Order {

	private int orderid;
	private String customername;
	private double totalprice;
	
	public Order(int orderid, String customername, double totalprice)
	{
		this.orderid=orderid;
		this.customername=customername;
		this.totalprice=totalprice;
	}
	
	public int getOrderId()
	{
		return orderid;
	}
	
	public String getCustomerName()
	{
		return customername;
	}
	
	public double getTotalPrice()
	{
		return totalprice;
	}
	@Override
	public String toString()
	{
		return "Order ID: "+orderid+", Customer: "+customername+", Total Price: "+totalprice;
	}
}
