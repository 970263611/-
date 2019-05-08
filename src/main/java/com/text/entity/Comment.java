package com.text.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Comment {

	//评价表
	
	private int id;
	private String create_user; //创建人
	private String create_time; //创建时间
	private int a_id;			//关联的文章id
	private String message;		//评价信息
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
