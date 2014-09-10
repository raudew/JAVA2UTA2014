//Sales.java
import javax.swing.JOptionPane;  
import java.util.ArrayList;

public class Sales
{

	static String statement = "";

	public static void main(String[] args) {
		ArrayList<Customer> customerArray = new ArrayList<Customer>();

		Customer c1 = new Customer("Davis ", new Address("Cooper Street", "Arlington", "Texas", 76019), 65783);

		Customer c2 = new Customer("Jones ", new Address("Fifth Street", "Dallas", "Texas", 76000), 11123);

		c1.addToProductList(new Music("Meet Bach", 0.99, new Date(1, 5, 2010), Music.GenreType.CLASSICAL, "Bach", 5));
		c1.addToProductList(new Music("Rihanna", 1.29, new Date(6, 5, 2010), Music.GenreType.ROCK, "Rihanna", 8));
		c1.addToProductList(new App("Tennis", 9.99, new Date(3, 18, 2010), App.AppType.GAME, "Ubisoft"));

		c2.addToProductList(new Music("For the Road", 0.99, new Date(2, 8, 2010), Music.GenreType.COUNTRY, "Swift", 12));
		c2.addToProductList(new App("Learn Java", 5.99, new Date(9, 1, 2010), App.AppType.EDUCATION, "Adobe"));
		c2.addToProductList(new App("Pages", 9.99, new Date(5, 30, 2010), App.AppType.PRODUCTIVITY, "Apple"));

		customerArray.add(c1);
		customerArray.add(c2); 

	   for(Customer c : customerArray)
		{
			statement += c.createHistory();
		}

		JOptionPane.showMessageDialog(null, statement, "Purchase History", JOptionPane.PLAIN_MESSAGE);
		 

		//System.out.println(c1.getName() + c1.getAddress() + c1.productList);
		//System.out.println(c2.getName() + c2.getAddress() + c2.productList);

		//System.out.println(c1 + c1.createHistory());
		//System.out.println(c2 + c2.createHistory());

		//System.out.println(statement);

		//JOptionPane.showMessageDialog(null, null, "Title",JOptionPane.PLAIN_MESSAGE);// DEFAULT_OPTION
 
	}
}