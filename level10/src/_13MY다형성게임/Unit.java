package _13MY다형성게임;

public abstract class Unit {
	int curhp;
	int maxhp;
	int power;
	String name;
	

	Unit(){};
	
	Unit(String names, int max, int pow){
		name = names;
		maxhp = max;
		curhp = max;
		power = pow;
		
	}
	void init(int hp, int pow) {
		maxhp = hp;
		curhp = hp;
		power = pow;
	}
	
	void attacks(Unit target) {
		target.curhp -= this.power;
		System.out.println("["+this.name+"]"+"가 "+"["+target.name+"]"+
				"에게 " + this.power+"의 데미지를 입힙니다.");
		if(target.curhp < 0) {
			target.curhp = 0;
			System.out.println("["+target.name+"]"+"이 죽었습니다");
		}
		return;
	}
	
	void skills(Unit target) {
		System.out.println(this.name + "이 스킬을 사용! 데미지 두배!");
		target.curhp -= this.power*2;
		System.out.println("["+target.name+"]"+" 이 치명상을 입었다! "+"[데미지] "+this.power*2);
		if(target.curhp < 0) {
			target.curhp = 0;
			System.out.println("["+target.name+"]"+"이 죽었습니다");
		}
		return;
	}

	@Override
	public String toString() {
		return "[" + name + "]"+" "+"["+ curhp +"/"+maxhp+"]"+" "+"["+power+"]";
	}
	
	
	
	
	
	
	
}
