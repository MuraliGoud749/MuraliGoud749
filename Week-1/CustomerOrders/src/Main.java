import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of orders: ");
		int numOrders=sc.nextInt();
		sc.nextLine();
		Order[] orders=new Order[numOrders];
		
		for(int i=0; i<numOrders; i++)
		{
			System.out.println("Enter details for order "+(i+1)+":");
			System.out.println("OrderID: ");
			int orderid=sc.nextInt();
			sc.nextLine();
			System.out.println("Customer Name: ");
			String customername=sc.next();
			System.out.println("Total Price: ");
			double totalprice=sc.nextDouble();
			sc.nextLine();
			orders[i]=new Order(orderid, customername, totalprice);
		}
		
		System.out.println("Choose sorting method (1 for Bubble sort, 2 for Quick sort): ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			SortingAlgorithms.bubbleSort(orders);
			System.out.println("Orders sorted using Bubble Sort: ");
			break;
		case 2:
			SortingAlgorithms.quickSort(orders,  0,  orders.length-1);
			System.out.println("Orders sorted using Quick Sort: ");
			break;
		default:
			System.out.println("Invalid choice. Exiting...");
			sc.close();
			return;
		}
		
		for(Order order:orders)
		{
			System.out.println(order);
		}
		sc.close();
	}

}
