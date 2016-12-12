package com.xiaoming.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Purchase {

	private Integer id;
	private Date time;
	private BigDecimal totalPrice;
	private String supplier;
	private Set<PurchaseEntry> entries = new HashSet<PurchaseEntry>();
	
	public Purchase() {
		
	}
	
	public Purchase(Integer id, Date time, BigDecimal totalPrice, String supplier) {
		super();
		this.id = id;
		this.time = time;
		this.totalPrice = totalPrice;
		this.supplier = supplier;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Set<PurchaseEntry> getEntries() {
		return entries;
	}

	public void setEntries(Set<PurchaseEntry> entries) {
		this.entries = entries;
	}
	
	
}
