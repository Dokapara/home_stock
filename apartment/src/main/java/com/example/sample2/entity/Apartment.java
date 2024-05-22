package com.example.sample2.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private String salesrep;
	private double floorarea;
	private Date registerdate;

	// コンストラクタ、ゲッター、セッターなど

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalesrep() {
		return salesrep;
	}

	public void setSalesrep(String salesrep) {
		this.salesrep = salesrep;
	}

	public double getFloorarea() {
		return floorarea;
	}

	public void setFloorarea(double floorarea) {
		this.floorarea = floorarea;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}
}
