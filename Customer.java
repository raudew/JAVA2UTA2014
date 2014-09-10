/* Customer
 */
import java.util.ArrayList;
public class Customer implements PurchaseHistory 
{
	private String name;
	private Address address;
	private int accountNumber;
	ArrayList<Product> productList= new ArrayList<Product>();
	
	public Customer(String _name, Address _address, int _accountNumber)
	{
		setName(_name);
		setAddress(_address);
		setAccountNumber(_accountNumber);
	}//End Method Customer
	
	//get Methods
	public  String getName()
	{
		return name;
	}
	
	public  Address getAddress()
	{
		return address;
	}
	
	public  int getAccountNumber()
	{
		return accountNumber;
	}
	
	//Set Methods
	public  void setName(String _name)
	{
		name = _name;
	}
	
	public  void setAddress(Address _address)
	{
		address = _address;
	}
	
	public  void setAccountNumber(int _accountNumber)
	{
		accountNumber = _accountNumber;
	}
	
	public String toString()
	{
		return ( name +"\n\r" + address + "\n\r" + "account#" + accountNumber);
	}	
	
	//+createHistory():String
	public String createHistory()
	{
	Double charge = calculateCharge();

		int numberOfMusicProducts = 0;
		int numberOfApps = 0;

		for(int i = 0; i < productList.size(); i++)
		{
			if ((productList.get(i).title == "Meet Bach")
					|| (productList.get(i).title == "Rihanna")
					|| (productList.get(i).title == "For the Road"))
				numberOfMusicProducts++;
			else
				numberOfApps++;
		}

		return (name + " " + numberOfMusicProducts + " " + "music products " + numberOfApps + " " + "apps" + " $" +  String.format(" %.2f ", charge) + "\n");
	}

	
	//+calculateCharge(Void):Double
	public Double calculateCharge()
	{
	Double output = 0.00;

		for (int i = 0; i < productList.size(); i++) 
		{
			if ((productList.get(i).title == "Meet Bach")
					|| (productList.get(i).title == "Rihanna")
					|| (productList.get(i).title == "For the Road"))
					
				output += ((productList.get(i).getPrice()) * ((Music)productList.get(i)).getNumberOfSongsPurchased());
			else
				output += ((productList.get(i).getPrice()));
		}
		return output;
	}

	
	//+addToProductList(Product):Void
	public void addToProductList(Product _product)
	{
		productList.add(_product);
	}

}//End Class Customer