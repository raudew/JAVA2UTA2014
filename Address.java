/* Address
 
 */
 
 public class Address
{
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address()
	{
		setStreet("");
		setCity("");
		setState("");
		setZip(0);
	}
	public Address (String _street, String _city, String _state, int _zip)
	{
		setStreet(_street);
		setCity(_city);
		setState(_state);
		setZip(_zip);
		
	}//End Address Constructor
	
	//get Methods
	public  String getStreet()
	{
		return street;
	}
	
	public  String getCity()
	{
		return city;
	}
	
	public  String getState()
	{
		return state;
	}
	
	public  int getZip()
	{
		return zip;
	}
	
	//set Methods
	public  void setStreet(String _street)
	{
		street = _street;
	}
	
	public  void setCity(String _city)
	{
		city = _city;
	}
	
	public  void setState(String _state)
	{
		state = _state;
	}
	
	public  void setZip(int _zip)
	{
		zip = _zip;
	}
	
	public  String toString()
	{
		return ( street + ", " + city + " " + state + " " + zip );
	}
}//End Class