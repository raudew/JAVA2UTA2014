

public class App extends Product {
	public enum AppType{GAME, PRODUCTIVITY, EDUCATION};
	private AppType gameType;
	private String developer;

	public App(String title, double price, Date purchaseDate,AppType gameType,String developer ){
		super(title, price, purchaseDate);
		setGameType(gameType);
		setDeveloper(developer);
		
	}

	public AppType getGameType() {
		return gameType;
	}

	public void setGameType(AppType gameType) {
		this.gameType = gameType;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String toString(){
		
		return gameType+ " "+ developer;
	}

}
