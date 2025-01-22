package _13MY다형성게임;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameManager {
	Random rd= new Random();
	static Scanner sc = new Scanner(System.in);
	String curStage = "";
	static String nextStage = "";
	
	Map<String,Stage> stageList = new HashMap<String,Stage>();
	
	GameManager(){
		stageList.put("TITLE", new StageTitle());
		stageList.put("BATTLE", new StageBattle());
		stageList.put("LOBBY", new StageLobby());
		
		nextStage = "TITLE";
		
	}

	public boolean changeStage() {
		System.out.println("curStage : "+curStage);
		System.out.println("nextStage : "+ nextStage);
		
		curStage = nextStage;
		
		stageList.get(curStage).init();
		boolean run = true;
		while(run) {
			run = stageList.get(curStage).Update();
		}
		if(nextStage.equals("")) {
			return false;
		}else {
			return true;
		}
		
	}

}
