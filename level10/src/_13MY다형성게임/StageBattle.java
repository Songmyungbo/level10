package _13MY다형성게임;

import java.util.ArrayList;
import java.util.Random;

public class StageBattle extends Stage {
	UnitManager unitManager = new UnitManager();
	ArrayList<Player> pList = null;
	ArrayList<Unit> mList = null;
	Random rd = new Random();
	int monDeath = 0;
	int playerDeath = 0;

	public boolean Update() {
		boolean turn = true;
		boolean run = true;
		int playerIdx = 0;
		int monsterIdx = 0;
		while (run) {
			if (turn) {
				printALL();
				if (playerIdx < pList.size()) {
					if (pList.get(playerIdx).curhp > 0) {
						playerAttack(playerIdx);
					}
					playerIdx++;
				} else {
					playerIdx = 0;
					turn = !turn;
				}

			} else if (!turn) {
				if (monsterIdx < mList.size()) {
					if (mList.get(monsterIdx).curhp > 0) {
						monsterAttack(monsterIdx);
					}
					monsterIdx++;
				} else {
					monsterIdx = 0;
					turn = !turn;
				}
			}
			dieCheck();
			if (playerDeath == pList.size()) {
				System.out.println("플레이어가 다 죽었습니다");
				GameManager.nextStage = "";
				break;
			} else if (monDeath == mList.size()) {
				System.out.println("몬스터가 다 죽었습니다");
				GameManager.nextStage = "LOBBY";
				break;
			}
		}
		return false;
	}

	private void dieCheck() {
		playerDeath = 0;
		monDeath = 0;
		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).curhp == 0) {
				playerDeath++;
			}
		}
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).curhp == 0) {
				monDeath++;
			}
		}
	}

	private void monsterAttack(int monsterIdx) {
		Unit monster = mList.get(monsterIdx);
		while (true) {
			int playerIdx = rd.nextInt(pList.size());
			if (pList.get(playerIdx).curhp < 0) {
				continue;
			} else {
				monster.attacks(pList.get(playerIdx));
				break;
			}
		}
	}

	private void playerAttack(int playerIdx) {
		Player player = pList.get(playerIdx);
		System.out.println("====[메뉴 선택]====");
		System.out.println("[" + player.name + "]" + " " + "[1.어택] [2.스킬]");
		int sel = GameManager.sc.nextInt();
		if (sel == 1) {
			while (true) {
				int idx = monRdIdxs();
				if (mList.get(idx).curhp < 0) {
					continue;
				}
				if (mList.get(idx).curhp > 0) {
					player.attacks(mList.get(idx));
					break;
				}
			}

		} else if (sel == 2) {
			while(true) {
				int idx = monRdIdxs();
				if(mList.get(idx).curhp < 0) {
					continue;
				}
				if(mList.get(idx).curhp > 0) {
					player.skills(mList.get(idx));
					break;
				}
			}
		}
	}

	private int monRdIdxs() {
		int monRdIdx = rd.nextInt(mList.size());
		return monRdIdx;
	}

	private void printALL() {
		System.out.println("====[BATTLE]====");
		System.out.println("====[PLAYER]====");
		for (Player p : pList) {
			System.out.println(p);
		}
		System.out.println("====[MONSTER]====");
		for (Unit m : mList) {
			System.out.println(m);
		}
	}

	public void init() {
		unitManager.monList.clear();
		unitManager.monsterRandomSet(4);
		pList = null; //
		pList = unitManager.playerList;
		mList = null;
		mList = unitManager.monList;
		monDeath = mList.size();
		playerDeath = pList.size();
	}

}
