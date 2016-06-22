package jp.co.SpringBBS.dto;

public class UserManagementDto {
	private int id;
	private String loginId;
	private String name;
	private String branchName;
	private String positionName;
	private boolean userState;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public boolean isUserState() {
		return userState;
	}
	public void setUserState(boolean userState) {
		this.userState = userState;
	}
}
