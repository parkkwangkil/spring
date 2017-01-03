package vo;

public class Member {
	private int memberNum;
	private String password;
	private String email;

	public Member() {
	}

	public Member(int memberNum, String password, String email) {
		super();
		this.memberNum = memberNum;
		this.password = password;
		this.email = email;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberVO [memberNum=" + memberNum + ", password=" + password + ", email=" + email + "]";
	}

}