package 추상_개념;

import java.util.ArrayList;

public class _MainPizza {

	public static void main(String[] args) {
		pizzaService service = new pizzaService();
		
		ArrayList<Pizza> orderList = new ArrayList<Pizza>();
		
		// 업캐스팅
		orderList.add(new SweetPotatoPizza(12000, "피자헛"));
		orderList.add(new BulgogiPizza(10000, "일인피자"));
		orderList.add(new printApplePizza(13000, "미스터피자"));
		orderList.add(new BulgogiPizza(20000, "도미노피자"));
		orderList.add(new SweetPotatoPizza(8000, "피자스쿨"));
		
		service.orderPizzas(orderList);
	}

}
