package 추상_개념2;

public class MyBakery extends  MyBrand{
	
	public static String getSlogan() {
		return String.format(SLOGAN, "명보빵점");
	}
	
	private static int myNum = 0;
	
	private boolean isHandmade;
	
	public MyBakery(String name , boolean isHandMade) {
		super(++myNum, name);
		this.isHandmade = isHandMade;
	}

	@Override
	public void takeOrder() {
		System.out.printf("명보 빵점 %s 빵을 주문했습니다 ",super.info()+(isHandmade? "수제" : ""));
	}
	
}
