package ua.lviv.lgs.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name="custom")
@IdClass(Univercity.class)
public class Univercity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	
	@NotNull
	@Column
	private String name;
	
	@Column
	private int levelAdapt;
	
	@Column
	private int countInst;
	
	@Column
	private int countPupils;
	
	@Column
	private String adressUniversity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public int getLevelAdapt() {
		return levelAdapt;
	}

	@Autowired
	public void setLevelAdapt(int levelAdapt) {
		this.levelAdapt = levelAdapt;
	}

	public int getCountInst() {
		return countInst;
	}

	@Autowired
	public void setCountInst(int countInst) {
		this.countInst = countInst;
	}

	@Autowired
	public int getCountPupils() {
		return countPupils;
	}

	@Autowired
	public void setCountPupils(int countPupils) {
		this.countPupils = countPupils;
	}

	@Autowired
	public String getAdressUniversity() {
		return adressUniversity;
	}

	@Autowired
	public void setAdressUniversity(String adressUniversity) {
		this.adressUniversity = adressUniversity;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", name=" + name + ", levelAdapt=" + levelAdapt + ", countInst=" + countInst
				+ ", countPupils=" + countPupils + ", adressUniversity=" + adressUniversity + "]";
	}
	

	
	
	
	
}
