import java.util.*;
public class Product {

	private int productid;
	private String productname;
	private String category;
	
	public Product(int productid, String productname, String category)
	{
		this.productid=productid;
		this.productname=productname;
		this.category=category;
	}
	
	public int getProductId()
	{
		return productid;
	}
	
	public String getProductName()
	{
		return productname;
	}
	
	public String getCategory()
	{
		return category;
	}
	@Override
	public String toString()
	{
		return "Product ID: "+productid+", Name: "+productname+", Category: "+category;
	}
}
