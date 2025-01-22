package _13MY다형성게임;

import java.util.ArrayList;
import java.util.Random;

public class UnitManager {

	ArrayList<Player> playerList = new ArrayList<Player>();
	ArrayList<Unit> monList = new ArrayList<Unit>();
	String path = "_13MY다형성게임.";
	String monster[] = { "UnitWolf", "UnitBat", "UnitOrc" };
	Random rd = new Random();
	
	UnitManager() {
		playerList.add(new Player("전사", 1000, 45));
		playerList.add(new Player("마법사", 800, 60));
		playerList.add(new Player("힐러", 500, 70));
	}
	
	public void monsterRandomSet(int size) {
		for(int i = 0; i < size; i++) {
			int num = rd.nextInt(monster.length);
			int hp = rd.nextInt(100)+100;
			int power = rd.nextInt(11)+10;
			
			
			
			
			
		}
		
	}
	
}
