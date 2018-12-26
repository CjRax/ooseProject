import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class testShoppingTest {
	@Test
	public void testCustomerProfile() {
		Customer u1 = new Customer("Hulk", 9487);
		assertEquals("Hulk", u1.getName());
		assertEquals(9487, u1.getID());
	}

	@Test
	public void testClothesData() {
		Clothes c1 = new Clothes("A T-shirt", "T12345", 7);
		assertEquals("A T-shirt", c1.getName());
		assertEquals("T12345", c1.id());
		assertEquals(7, c1.price());
	}

	@Test
	public void testAmountOfVictualMoney() {
		Customer u1 = new Customer("Hulk", 9487, 1000);
		assertEquals(1000, u1.getAmountOfVictualMoney());

		Clothes c1 = new Clothes("A T-shirt", "T12345", 7);
		u1.buy(c1);
		assertEquals(993, u1.getAmountOfVictualMoney());
	}

	@Test
	public void testTotalPrice_ShoppingCar() {
		List<Clothes> cList = new ArrayList<Clothes>();
		Clothes c1 = new Clothes("A T-shirt", "T12345", 8);
		Clothes c2 = new Clothes("B T-shirt", "T12346", 280);
		Clothes c3 = new Clothes("C T-shirt", "T12347", 290);
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);

		ShoppingCar2 sc = new ShoppingCar2();
		assertEquals(577, sc.totalPrice(cList));
	}

	@Test
	public void testDiscount_ShoppingCar2() {
		ShoppingCar2 sc = new ShoppingCar2();
		sc.setDiscount(577);
		assertEquals((double) 0.85, (double) sc.getDiscount(), 0.0001);

//		sc.setDiscount(1000);
//		assertEquals(0.75, sc.getDiscount(), 0.0001);
//		sc.setDiscount(499);
//		assertEquals(1, sc.getDiscount(), 0.0001);

	}
//
//	@Test
//	public void testPayment_ShoppingCar2() {
//		ShoppingCar2 sc = new ShoppingCar2();
//		sc.setPayment(577, 0.85);
//		assertEquals(490.45, sc.getPayment(), 0.0001);
//
//	}

}
