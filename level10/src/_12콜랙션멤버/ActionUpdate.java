package _12콜랙션멤버;

public class ActionUpdate implements Action{

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		if(dao.listSizeCheck()) {
			System.out.println("회원 먼저 추가해주세요!");
			return;
		}
		String id = Utils.getInstance().getStringValue("수정할 아이디를 입력하세요 >> ");
		int idx = dao.fountIdx(id);
		if(idx == -1) {
			System.out.println("아이디를 찾지 못했습니다");
		}else {
			String pw = Utils.getInstance().getStringValue("수정 할 비밀번호를 입력 >> ");
			boolean check = dao.reMember(idx,pw);
			if(check) {
				String name = Utils.getInstance().getStringValue("수정 할 이름 입력 >> ");
				dao.reMemberName(idx,name);
				System.out.println("비밀번호 변경 완료!");
				return;
			}
			System.out.println("비밀번호가 일치하지 않습니다");
			return;
		}
	}

}
