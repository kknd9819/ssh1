package com.ssh.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ssh.entity.Teacher;
import com.ssh.interfaces.DAO;

public class TeacherDao implements DAO {
	
	public List<Teacher> getAll(){
		
		List<Teacher> al = new ArrayList<Teacher>();
		Collections.addAll(al, new Teacher(1,"孔子",30),new Teacher(2,"孟子",31),new Teacher(3,"庄子",32));
		return al;
		
	}
}
