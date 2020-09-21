package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodId;
	private String prodName;
	private Double prodCost;
	private Double gst;
	private Double prodTotal;
	private String note;
	private String address;
	private String contact;

	public Product(Integer prodId, String prodName, Double prodCost, Double gst, Double prodTotal, String note,
			String address, String contact) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.gst = gst;
		this.prodTotal = prodTotal;
		this.note = note;
		this.address = address;
		this.contact = contact;
	}

	public Product() {
		super();
	}
	
	

}
