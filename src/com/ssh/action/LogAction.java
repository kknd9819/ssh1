package com.ssh.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Teacher;
import com.ssh.entity.UserInfo;
import com.ssh.mdservice.ModelService;

public class LogAction {

	private UserInfo user;
	
	private int msgState;

	private ModelService service ;
	
	
	public int getMsgState() {
		return msgState;
	}

	public void setMsgState(int msgState) {
		this.msgState = msgState;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
	
	

	public ModelService getService() {
		return service;
	}

	public void setService(ModelService service) {
		this.service = service;
	}

	public String login() {

		UserInfo user_lg =	service.login(user);
         
		if(user_lg == null){
			return "index";
		}
		
		List<Teacher> infoes = service.getAll("teacherdao");
		
	   Map mp = 	(Map)ActionContext.getContext().get("request");
	   
	   mp.put("infoes", infoes);
	   
		return "welcome";
	}
}
