package _13MY다형성게임;

public class StageTitle extends Stage{

	@Override
	public boolean Update() {
		System.out.println("=== TEXT RPG ===");
		System.out.println("아무버튼을 눌러주세요");
		String start = GameManager.sc.next();
		GameManager.nextStage = "LOBBY";
		return false;
		
	}
	@Override
	public void init() {
		
	}
}
