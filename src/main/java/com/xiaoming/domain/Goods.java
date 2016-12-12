package com.xiaoming.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {

	private Integer id;
	private String name;
	private Integer quantity;
	private BigDecimal price;
	private BigDecimal inPrice;
	private Date productDate;
	private Integer shelfLife;
	private String description;
	
	public Goods() {
		
	}
	
	public Goods(Integer id, String name, Integer quantity, BigDecimal price, BigDecimal inPrice, Date productDate,
			Integer shelfLife, String description) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.inPrice = inPrice;
		this.productDate = productDate;
		this.shelfLife = shelfLife;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getInPrice() {
		return inPrice;
	}
	public void setInPrice(BigDecimal inPrice) {
		this.inPrice = inPrice;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public Integer getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(Integer shelfLife) {
		this.shelfLife = shelfLife;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
