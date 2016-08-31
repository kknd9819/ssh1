package com.ssh.mdservice;

import java.util.List;
import java.util.Map;

import com.ssh.entity.UserInfo;
import com.ssh.interfaces.DAO;

public class ModelService {

	
	private Map<String,DAO>daoMap;

	public Map<String, DAO> getDaoMap() {
		return daoMap;
	}

	public void setDaoMap(Map<String, DAO> daoMap) {
		this.daoMap = daoMap;
	}
	
	public List getAll(String key){
		return this.daoMap.get(key).getAll();
	}
	
	public UserInfo login(UserInfo user){
		 
		if(user.getLogName().equals("tom") && "666".equals(user.getKeyWord()))
			return new UserInfo("tom","666","ADMIN");
		else
			 return null;
	}
}
