package com.javaex.phone;

public class PersonVo {

	private int person_id;
	private String name;
	private String hp;
	private String company;
	
	public PersonVo() {
	}
	
	public PersonVo(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	public PersonVo(int person_id, String name, String hp, String company) {
		this.person_id = person_id;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	protected int getPerson_id() {
		return person_id;
	}
	protected String getName() {
		return name;
	}
	protected String getHp() {
		return hp;
	}
	protected String getCompany() {
		return company;
	}
	protected void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setHp(String hp) {
		this.hp = hp;
	}
	protected void setCompany(String company) {
		this.company = company;
	}
}
