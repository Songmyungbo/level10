package 추상_개념;

import java.util.ArrayList;

public class pizzaService {
	
	void orderPizzas(ArrayList<Pizza> orderList) {
		
		
		// 배열 -> 같은 파일이 여러개
		for(Pizza p : orderList) {
			p.makingPizza();
			System.out.println("----------");
		}
		
	}
}
