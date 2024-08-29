import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of products: ");
		int numProducts=sc.nextInt();
		sc.nextLine();
		
		Product[] products=new Product[numProducts];
		
		for(int i=0; i<numProducts; i++) {
			System.out.println("Enter details for product "+(i+1)+":");
			System.out.println("Product ID: ");
			int productid=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Product Name: ");
			String productname=sc.nextLine();
			
			System.out.println("Category: ");
			String category=sc.nextLine();
			
			products[i]=new Product(productid, productname, category);
		}
		Arrays.sort(products, (a, b)-> Integer.compare(a.getProductId(), b.getProductId()));
		System.out.println("Enter Product ID to search: ");
		int searchProductId=sc.nextInt();
		Product linearResult=SearchAlgorithms.linearSearch(products, searchProductId);
		System.out.println("Linear Search Result: "+(linearResult!=null ? linearResult:"Not found"));
		
		Product binaryResult=SearchAlgorithms.binarySearch(products,  searchProductId);
		System.out.println("Binary Search Result: "+(binaryResult!=null?binaryResult:"Not found"));
	}

}
