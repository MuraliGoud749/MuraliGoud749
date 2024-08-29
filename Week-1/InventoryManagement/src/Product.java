import java.util.*;
public class Product {

	private String productid;
	private String productname;
	private int quantity;
	private double price;
	
	public Product(String productid, String productname, int quantity, double price)
	{
		this.productid=productid;
		this.productname=productname;
		this.quantity=quantity;
		this.price=price;
	}
	
	public String getProductid()
	{
		return productid;
	}
	
	public String getProductname()
	{
		return productname;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return "Productid: "+productid+", Name: "+productname+", Quantity: "+quantity+", Price: "+price;
	}
}
