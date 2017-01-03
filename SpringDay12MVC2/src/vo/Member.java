package vo;

public class Member {
	private String id;
	private String password;
	private String name;
	private String email;
	private String address;

	public Member() {
	}

	public Member(String id, String password, String name, String email, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Member(String password, String name, String email, String address) {
		super();
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", address="
				+ address + "]";
	}

}
