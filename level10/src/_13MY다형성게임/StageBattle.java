package _13MY다형성게임;

import java.util.ArrayList;
import java.util.Random;

public class StageBattle extends Stage{
	UnitManager unitManager = new UnitManager();
	ArrayList<Player> pList = null;
	ArrayList<Unit> mList = null;
	Random rd = new Random();
	int monDeath = 0;
	int playerDeath = 0;

	@Override
	public boolean Update() {
		System.out.println("====[BATTLE]====");
		System.out.println("====[PLAYER]====");
		
		
		
		
		
		
		return false;
	}

	@Override
	public void init() {
		unitManager.mon_list.clear();
		unitManager.monsterRandomSet(4);
		pList = null; //
		pList = unitManager.player_list;
		mList = null;
		mList = unitManager.mon_list;
		monDeath = mList.size();
		playerDeath = pList.size();
		
	}

}
