import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
	public static void main(String args[])
	{
		ArrayList<Item> itemList = new ArrayList<Item>();

		Scanner bob = new Scanner(System.in);

		Item.askQuestion();
		char temp = bob.next().charAt(0);

		while (temp == 'y' || temp == 'Y')
		{
			Scanner input = new Scanner(System.in);

			System.out.print("Enter Item Name: ");
			String str = input.nextLine();

			System.out.print("Enter Quantity: ");
			int num = input.nextInt();

			System.out.print("Enter Price: ");
			double pr = input.nextDouble();

			itemList.add(new Item(str, num, pr));

			Item.askQuestion();
			temp = bob.next().charAt(0);
		}

		System.out.println("===============================================");
		System.out.println("\tShopping Cart List");
		Item.display(itemList);
		System.out.println("===============================================");
		Item.displaySummary();
	}
}
