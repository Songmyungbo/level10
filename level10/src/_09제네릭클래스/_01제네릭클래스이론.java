package _09제네릭클래스;
class Box<T>{
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

class Product<T, M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}

	
}

class Tv{
	String brand;
	int serialNo;
	Tv(String brand, int serialNo){
		super();
		this.brand = brand;
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", serialNo=" + serialNo + "]";
	}
}

public class _01제네릭클래스이론 {

	public static void main(String[] args) {
		Box<Integer> test = new Box();
		test.setT(10);
		System.out.println(test.getT());
		Box<String> test1 = new Box();
		test1.setT("개똥이");
		System.out.println(test1.getT());
		
		Box<Tv> test2 = new Box();
		test2.setT(new Tv("삼성",1111));
		System.out.println(test2.getT());
		
		Product<Integer,String> test3 = new Product();
		test3.setKind(1000);
		test3.setModel("모델명");
		System.out.println(test3);
		
		Product<Tv,String> test4 = new Product();
		test4.setKind(new Tv("LG",2222));
		test4.setModel("스탠바이미");
		
		System.out.println(test4);
		
		
	}

}
