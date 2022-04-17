import java.util.ArrayList;

public class Item
{
	// instance variables
	private String name;
	private int quantity;
	private double price;
	private double purchase;

	// class variables
	private static int totalItemCount = 0;
	private static int totalQuantity = 0;
	private static double totalPurchase = 0.0;

	// constructor
	public Item (String name, int quantity, double price)
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.purchase = quantity * price;

		this.totalItemCount = this.totalItemCount + 1;
		this.totalQuantity = this.totalQuantity + quantity;
		this.totalPurchase = this.totalPurchase + purchase;
	}

	// getter methods
	public String getName()
	{
		return this.name;
	}

	public int getQuantity()
	{
		return this.quantity;
	}

	public double getPrice()
	{
		return this.price;
	}

	// class methods
	public static int getTotalItemCount()
	{
		return totalItemCount;
	}

	public static int getTotalQuantity()
	{
		return totalQuantity;
	}

	public static double getTotalPurchase()
	{
		return totalPurchase;
	}

	// setter methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	// display Item toString
	public String toString()
	{
		return this.name + " " + this.quantity + " " + this.price;
	}

	// ask question
	public static void askQuestion()
	{
		System.out.println("Do you want to enter item to shopping cart?");
		System.out.println("y/Y (yes), any other key to exit");
	}

	// display arraylist
	public static void display(ArrayList<Item> temp)
	{
		for (Item a : temp)
		{
			System.out.println(a);
		}
	}

	// display summary
	public static void displaySummary()
	{
		System.out.println("Items:     " + getTotalItemCount());
		System.out.println("Quantity:  " + getTotalQuantity());
		System.out.println("Purchase: $" + getTotalPurchase());
	}
}
