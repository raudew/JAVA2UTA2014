/* Date
 
 */
 
 public class Date
{
	private int month;
	private int day;
	private int year;
	
	public Date(int _month, int _day, int _year)
	{
		setMonth(_month);
		setDay(_day);
		setYear(_year);
		
	}//End Date Constructor
	
	//get Methods
	public  int getMonth()
	{
		return month;
	}
	public  int getDay()
	{
		return day;
	}
	public  int getYear()
	{
		return year;
	}

	//set Methods
	public  void setMonth(int _month)
	{
		month = _month;
	}
	
	public  void setDay(int _day)
	{
		day = _day;
	}
	
	public  void setYear(int _year)
	{
		year = _year;
	}
	
	//toString Method
	public String toString()
	{
		return (month + "-" + day + "-" + year);
	}
}//End Class