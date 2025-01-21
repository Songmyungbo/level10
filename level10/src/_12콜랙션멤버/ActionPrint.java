package _12콜랙션멤버;

public class ActionPrint implements Action{
	

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		if(dao.listSizeCheck()) {
			System.out.println("회원이 없습니다");
			return;
		}
		dao.printAll();
		
	}

}
