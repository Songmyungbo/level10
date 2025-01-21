package _12콜랙션멤버;

import java.util.ArrayList;
import java.util.TreeSet;

public class MemberDAO {
	
	
	private ArrayList<Member> memberList;
	
	private MemberDAO() {
		memberList = new ArrayList<Member>();
	}
	private static MemberDAO instance;
	public static MemberDAO getInstance() {
		if(instance == null) instance = new MemberDAO();
		return instance;
	}
	
	
	public boolean addMember(String id, String pw, String name) {
		if(listSizeCheck()) {
			memberList.add(new Member(id, pw, name));
			return true;
		}else {
			if(idCheck(id)) {
				memberList.add(new Member(id, pw, name));
				return true;
			}else {
				System.out.println("해당 아이디는 존재합니다");
				return false;
			}
		}
	}
	private boolean idCheck(String id) {
		int idxs = -1;
		int idx = 0;
		for(Member mList : memberList) {
			if(mList.getId().equals(id)) {
				idxs = idx;
			}
			idx++;
		}
		if(idxs != -1) {
			return false;
		}
		return true;
	}
	public boolean delMember(String id) {
		if(!idCheck(id)) {
			int delIdx = fountIdx(id);
			if(delIdx != -1) {
				memberList.remove(delIdx);
				return true;
			}
		}
		return false;
		
	}
	public int fountIdx(String id) {
		int idx = -1;
		for(int i = 0; i < memberList.size(); i++) {
			if(id.equals(memberList.get(i).getId())) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	public boolean listSizeCheck() {
		if(memberList.size() == 0) {
			return true;
		}
		return false;
	}
	public boolean reMember(int idx, String pw) {
		if(memberList.get(idx).getPw().equals(pw)) {
			return true;
		}
		return false;
	}
	public void reMemberName(int idx, String name) {
		memberList.get(idx).setName(name);
		return;
	}
	public void printAll() {
		TreeSet<Member> treeSet = new TreeSet<>(new MemberComp(MemberComp.SortBy.NAME));
		
		for(Member m : memberList) {
			treeSet.add(m);
		}
		System.out.println("=================");
		
		for(Member ts : treeSet) {
			System.out.println(ts);
		}
		System.out.println("==================");
	}
	public String savePrintAll() {
		String result = "";
		TreeSet<Member> treeSet = new TreeSet<>(new MemberComp(MemberComp.SortBy.ID));
		for(Member m : memberList) {
			treeSet.add(m);
		}
		for(Member ts : treeSet) {
			result += ts.getId()+"/"+ts.getPw()+"/"+ts.getName()+"\n";
		}
		return result;
	}

	public void loadData(String loadData) {
		if(loadData.isBlank()) {
			System.out.println("데이터가 존재하지 않습니다");
			return;
		}
		String temp[] = loadData.split("\n");
		for(int i = 0; i < temp.length; i++) {
			String[] info = temp[i].split("/");
			memberList.add(new Member(info[0], info[1], info[2]));
		}
	}
}
