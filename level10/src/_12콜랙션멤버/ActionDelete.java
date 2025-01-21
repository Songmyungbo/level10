package _12콜랙션멤버;

public class ActionDelete implements Action{

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		if(dao.listSizeCheck()) {
			System.out.println("회원 추가먼저 해주세요");
			return;
		}
			String id = Utils.getInstance().getStringValue("삭제할 아이디 입력 >> ");
			boolean check = dao.delMember(id);
		if(check) {
			System.out.println("삭제 완료!");
			return;
		}
		System.out.println("해당 회원이 존재하지 않습니다");
		return;
	}

}
