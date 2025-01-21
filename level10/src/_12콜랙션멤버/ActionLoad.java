package _12콜랙션멤버;

public class ActionLoad implements Action{

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		String fileName = "member.txt";
		dao.loadData(Utils.getInstance().loadDataToFile(fileName));
		System.out.println("불러오기 완료!");
	}

}
