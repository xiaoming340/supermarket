package com.xiaoming.domain;

public class PurchaseEntry implements java.io.Serializable {
	
	private static final long serialVersionUID = 47L;

	// �����Ľ���
	private Purchase purchase;
	// ��������Ʒ
	private Goods goods;
	private Integer num;
	
	public PurchaseEntry() {
		
	}

	public PurchaseEntry(Purchase purchase, Goods goods, Integer num) {
		super();
		this.purchase = purchase;
		this.goods = goods;
		this.num = num;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	
}
