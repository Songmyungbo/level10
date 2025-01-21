package _12콜랙션멤버;

public class Member implements Comparable<Member>{
	private String id;
	private String pw;
	private String name;
	@Override
	public String toString() {
		return id + " : " + pw + " : " + name;
	}
	
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Member o) {
		if(name.compareTo(o.name) == 0) {
			return id.compareTo(o.id);
		}
		return name.compareTo(o.name);
	}


	
}
