package 추상_개념;

public class BulgogiPizza extends Pizza{

	public BulgogiPizza(int price, String brand) {
		super(price, brand,"불고기 피자");
		// TODO Auto-generated constructor stub
	}

	@Override
	void putTopping() {
		System.out.println("불고기 토핑!!");
	}
	
	
}
