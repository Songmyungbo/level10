package 추상_개념2;

public class _Main {

	public static void main(String[] args) {
		System.out.println(MyBakery.getSlogan());
		
		MyBakery store1 = new MyBakery("구미", false);
		MyBakery store2 = new MyBakery("강남", true);
	
	
		
		MyChicken store3 = new MyChicken("홍대");	
		MyChicken store4 = new MyChicken("강남");	
		MyChicken store5 = new MyChicken("신촌");
		
	
		
		MyCafe store6 = new MyCafe("양주", false);
		MyCafe store7 = new MyCafe("파주", true);
		MyCafe store8 = new MyCafe("남양주",true);
		
		MyBrand[] myStores = {store1,store2,store3,store4,store5,store6,store7,store8};
		
		System.out.println();
		for(MyBrand store : myStores) {
			if(store instanceof MyBakery) {
				MyBakery mystore = (MyBakery)store;
				store.takeOrder();
			}
		}
	}
}
