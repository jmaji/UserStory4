package com.jm;

public class Project {

	int id;
	String title;
	String descr;
	String domain;
	
	
	public Project(int id, String title, String descr, String domain) {
		super();
		this.id = id;
		this.title = title;
		this.descr = descr;
		this.domain = domain;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescr() {
		return descr;
	}



	public void setDescr(String descr) {
		this.descr = descr;
	}



	public String getDomain() {
		return domain;
	}



	public void setDomain(String domain) {
		this.domain = domain;
	}



	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", descr=" + descr + ", domain=" + domain + "]";
	}
	
	

	
	
}
