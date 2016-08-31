package com.ssh.entity;

public class UserInfo {

	private String logName;
	
	private String keyWord;
	
	private String userType;
	
	public UserInfo(){}

    

	public UserInfo(String logName, String keyWord, String userType) {
		super();
		this.logName = logName;
		this.keyWord = keyWord;
		this.userType = userType;
	}



	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}



	@Override
	public String toString() {
		return "UserInfo [logName=" + logName + ", keyWord=" + keyWord
				+ ", userType=" + userType + "]";
	}


	
	
}
