import java.util.*;
public class SearchAlgorithms {

	public static Product linearSearch(Product[] products, int productid)
	{
		for(Product product:products)
		{
			if(product.getProductId()==productid)
			{
				return product;
			}
		}
		return null;
	}
	
	public static Product binarySearch(Product[] products, int productid)
	{
		int left=0;
		int right=products.length-1;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			Product midProduct=products[mid];
			
			if(midProduct.getProductId()==productid)
			{
				return midProduct;
			}
			if(midProduct.getProductId()<productid)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return null;
	}
}
