
public class Customer {

	private String name;
	private int id;
	private int amountOfVictualMoney;

	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	
	public Customer(String name, int id, int amountOfVictualMoney) {
		this.name = name;
		this.id = id;
		this.amountOfVictualMoney = amountOfVictualMoney;
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.id;
	}
	
	public int getAmountOfVictualMoney() {
		return this.amountOfVictualMoney;
	}

	public void buy(Clothes c1) {
		this.amountOfVictualMoney -= c1.price();
	}
}
