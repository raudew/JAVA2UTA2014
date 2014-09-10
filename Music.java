/* Music

*/

public class Music extends Product
{
	public enum GenreType{CLASSICAL, ROCK, COUNTRY};
	private GenreType genre;
	private String artist;
	private int numberOfSongsPurchased;
	
	public Music(String _title, Double _price, Date _date, GenreType _genre, String _artist, int _numberOfSongsPurchased)
	{
		super(_title, _price, _date);
		setGenre(_genre);
		setArtist(_artist);
		setNumberOfSongsPurchased(_numberOfSongsPurchased);
	}//End Music
	
	//get Methods
	public  GenreType getGenre()
	{
		return genre;
	}
	
	public  String getArtist()
	{
		return artist;
	}
	
	public  int getNumberOfSongsPurchased()
	{
		return numberOfSongsPurchased;
	}
	
	//set Methods
	public void setGenre(GenreType _genre)
	{
		genre = _genre;
	}
	
	public void setArtist(String _artist)
	{
		artist=_artist;
	}
	
	public void setNumberOfSongsPurchased(int _numberOfSongsPurchased)
	{
		numberOfSongsPurchased = _numberOfSongsPurchased;
	}
	
	public String toString()
	{
		return (genre + " " + artist + " " + numberOfSongsPurchased );
	}

}//End Class
