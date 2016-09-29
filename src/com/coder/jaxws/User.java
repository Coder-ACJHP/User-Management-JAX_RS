package com.coder.jaxws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String profesion;
	
	public User() {}

	public User(int id, String name, String profesion) {

		this.id = id;
		this.name = name;
		this.profesion = profesion;
	}

	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getProfesion() {
		return profesion;
	}
	@XmlElement
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
