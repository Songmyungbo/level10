package 추상_개념2;

public class MyCafe extends MyBrand{
	
	private static int myNum = 0;
	private boolean takeOut;
	public static String getSlogan() {
		return String.format(SLOGAN, "명보 카페");
	}
	public MyCafe(String name, boolean takeOuts) {
		super(++myNum, name);
		this.takeOut = takeOuts;
	}
	@Override
	public void takeOrder() {
		if(takeOut) {
			System.out.printf("명보 카페 %s은 테이크아웃점 입니다\n",super.info());
		}else {
			System.out.printf("명보 카페 %s은 테이크아웃점이 아닙니다\n",super.info());
			System.out.println("매장에서 드시겟습니까?");
		}
	}
}
