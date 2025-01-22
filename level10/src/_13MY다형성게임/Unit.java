package _13MY다형성게임;

public abstract class Unit {
	int curhp;
	int maxhp;
	int power;
	String name;
	
	Unit(){};
	
	Unit(String name, int max, int pow){
		this.name = name;
		maxhp = max;
		curhp = max;
		power = pow;
		
	}
	
	
	
	
	
	
	
}
