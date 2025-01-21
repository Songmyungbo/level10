package _12콜랙션멤버;

public class ActionInsert implements Action{
	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.println("==== [ 회원가입 ] ====");
		String id = Utils.getInstance().getStringValue("아이디를 입력하세요 >> ");
		String pw = Utils.getInstance().getStringValue("패스워드를 입력하세요 >> ");
		String name = Utils.getInstance().getStringValue("이름을 입력하세요 >> ");
		// 추가하는 dao 연결
		boolean addMember = dao.addMember(id,pw,name);
		if(addMember) {
			System.out.println("회원가입 완료");
		}
		return;
	}
	
}
