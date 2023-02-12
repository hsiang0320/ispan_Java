package bean;

public class User {
	private Integer id;
	private String account;
	private String pwd;

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", pwd=" + pwd + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
