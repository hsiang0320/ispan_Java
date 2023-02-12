package bean;

public class User {
	private Integer id; // 用Integer的原因是初始值為null int 則為0
	private String acc;
	private String pwd;

	public User() {

	}

	public User(String acc, String pwd) {
		this.acc=acc;
		this.pwd=pwd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
