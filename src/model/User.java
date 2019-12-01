package model;

public class User {
	private int id;
	private String userName;
	private String trueName;
	private String password;
//	private String photoFileName;

	public User(String userName, String trueName, String password) {
		this.userName = userName;
		this.trueName = trueName;
		this.password = password;

	}

	public User() {
	}

//	public User(String username, String trueName, String password) {
//   }

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

//	public String getPhotoFileName() {
//		return photoFileName;
//	}
//
//	public void setPhotoFileName(String photoFileName) {
//		this.photoFileName = photoFileName;
//	}
}
