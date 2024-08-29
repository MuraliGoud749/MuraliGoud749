import java.util.*;
public class InventoryManagementSystem {

	private Map<String, Product> inventory;
	
	public InventoryManagementSystem()
	{
		inventory=new HashMap<>();
	}
	public void addProduct(Product product)
	{
		inventory.put(product.getProductid(), product);
	}
	
	public void updateProduct(String productid, int quantity, double price)
	{
		Product product=inventory.get(productid);
		if(product!=null)
		{
			product.setQuantity(quantity);
			product.setPrice(price);
		}
		else
		{
			System.out.println("Product not found.");
		}
	}
	
	public void deleteProduct(String productid)
	{
		if(inventory.remove(productid)==null)
		{
			System.out.println("Product is deleted.");
		}
	}
	
	public void displayProduct(String productid)
	{
		Product product=inventory.get(productid);
		if(product!=null)
		{
			System.out.println(product);
		}
		else
		{
			System.out.println("Product not found.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		InventoryManagementSystem ims=new InventoryManagementSystem();
		while(true)
		{
			System.out.println("1. Add Product \n 2. Update Product \n 3. Delete Product \n 4. Display Product \n 5. Exit");
			System.out.println("Choose an option: ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter product Id: ");
				String id=sc.next();
				System.out.println("Enter product name: ");
				String name=sc.next();
				System.out.println("Enter Quatity: ");
				int quantity=sc.nextInt();
				System.out.println("Enter price: ");
				double price=sc.nextDouble();
				ims.addProduct(new Product(id, name, quantity, price));
				break;
			case 2:
				System.out.println("Enter product id to update: ");
				String updateid=sc.next();
				System.out.println("Enter new quantity: ");
				int newquantity=sc.nextInt();
				System.out.println("Enter new price: ");
				double newprice=sc.nextDouble();
				ims.updateProduct(updateid, newquantity, newprice);
				break;
			case 3:
				System.out.println("Enter productid to delete : ");
				String deleteid=sc.next();
				ims.deleteProduct(deleteid);
				break;
			case 4:
				System.out.println("Enter productId to display: ");
				String displayid=sc.next();
				ims.displayProduct(displayid);
				break;
			case 5:
				sc.close();
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
