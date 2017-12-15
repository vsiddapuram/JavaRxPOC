package com.nisum.rxjava.operators;

public class DomainObj {

	
	public DomainObj(int id ,String name,String status) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.status = status;
	}
	private int id;
	
	private String name;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
