
public class Member {
	private String name;
	private String role;

	public Member(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	String getRole() {
		return this.role;
	}
	void setName(String name) {
		this.name = name;
	}
	void setRole(String role) {
		this.role = role;
	}
}
