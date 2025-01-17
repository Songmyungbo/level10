package 추상_개념;

public class printApplePizza extends Pizza{

	public printApplePizza(int price, String brand) {
		super(price, brand, "하와이안피자");
	}

	@Override
	void putTopping() {
		System.out.println("파인애플 토핑!!");
	}
	
}
