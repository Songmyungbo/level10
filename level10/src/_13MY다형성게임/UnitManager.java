package _13MY다형성게임;

import java.util.ArrayList;
import java.util.Random;

public class UnitManager {

	ArrayList<Player> player_list = new ArrayList<Player>();
	ArrayList<Unit> mon_list = new ArrayList<Unit>();
	String path = "_13MY다형성게임.";
	String monster[] = { "UnitWolf", "UnitBat", "UnitOrc" };
	Random rd = new Random();
	
	UnitManager() {
		player_list.add(new Player("전사", 1000, 45));
		player_list.add(new Player("마법사", 800, 60));
		player_list.add(new Player("힐러", 500, 70));
	}
	
	public void monsterRandomSet(int size) {
		
		
	}
	
	
	
	
}
