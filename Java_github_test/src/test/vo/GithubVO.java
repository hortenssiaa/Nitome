package test.vo;

public class GithubVO {

	String id;
	String pw;
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
	@Override
	public String toString() {
		return "GithubVO [id=" + id + ", pw=" + pw + "]";
	}
	
	
}