package _12콜랙션멤버;

import java.util.Comparator;

public class MemberComp implements Comparator<Member>{
	enum SortBy{ID,NAME}
	
	private SortBy sortBy;
	
	public MemberComp(SortBy sortBy) {
		super();
		this.sortBy = sortBy;
	}

	@Override
	public int compare(Member o1, Member o2) {
		int result = 0;
		switch(sortBy) { 
		case ID : result = o1.getId().compareTo(o2.getId());break;
		case NAME : result = o1.getName().compareTo(o2.getName());if(result == 0) return 1;break;
		}
		return result;
	}
	
	
}