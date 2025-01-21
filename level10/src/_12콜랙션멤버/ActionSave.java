package _12콜랙션멤버;

public class ActionSave implements Action{

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		if(dao.listSizeCheck()) {
			System.out.println("저장 할 회원이 없습니다!");
			return;
		}
		String data = "";
		String fileName = "member.txt";
		
		data = dao.savePrintAll();
		Utils.getInstance().saveDataToFile(fileName,data);
		
	}
}
