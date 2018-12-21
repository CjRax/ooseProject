import java.util.List;

public class ShoppingCar2 {
	private double discount;
	private int totalPrice;
	private double payment;

	public void setDiscount(int totalPrice) {
		if(totalPrice>=500 && totalPrice<1000) {
			this.discount = 0.85;
		}
		else if(totalPrice>=1000){
			this.discount = 0.75;
		}
		else {
			this.discount = 1;
		}
	}
	
	public double getDiscount() {
		return this.discount;
	}
	
	public int totalPrice(List<Clothes> unitPriceObject) {		
		for(Clothes c:unitPriceObject) {
			this.totalPrice += c.price();
		}
		return this.totalPrice;
	}
	public void setPayment(int totalprice, double discount) {
		this.payment = totalprice * discount;
	}
	
	public double getPayment() {
		return this.payment;
	}
}
