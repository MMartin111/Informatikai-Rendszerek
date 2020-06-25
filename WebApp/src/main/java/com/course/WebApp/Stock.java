package com.course.WebApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="kepzettseg")
	private String kepzettseg;
	
	@Column(name="oraber")
	private String oraber;
	
	@Column(name="statusz")
	private String statusz;


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKepzettseg() {
		return kepzettseg;
	}

	public void setKepzettseg(String kepzettseg) {
		this.kepzettseg = kepzettseg;
	}
	
	public String getOraber() {
		return oraber;
	}
	
	public void setOraber(String oraber) {
		this.oraber = oraber;
	}
	
	public String getStatusz() {
		return statusz;
	}
	
	public void setStatusz(String statusz) {
		this.statusz = statusz;
	}

	@Override
	public String toString() {
		return "Stock [Id=" + Id + ", name=" + name + ", count=" + kepzettseg + "]";
	}
	
	

}
