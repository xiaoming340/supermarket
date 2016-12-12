package com.xiaoming.service;

import com.xiaoming.dao.GoodsDao;
import com.xiaoming.dao.PurchaseDao;
import com.xiaoming.dao.PurchaseEntryDao;

public class PurchaseService {

	private GoodsDao goodsDao;
	private PurchaseDao purchaseDao;
	private PurchaseEntryDao purchaseEntryDao;
	
	public GoodsDao getGoodsDao() {
		return goodsDao;
	}
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	public PurchaseDao getPurchaseDao() {
		return purchaseDao;
	}
	public void setPurchaseDao(PurchaseDao purchaseDao) {
		this.purchaseDao = purchaseDao;
	}
	public PurchaseEntryDao getPurchaseEntryDao() {
		return purchaseEntryDao;
	}
	public void setPurchaseEntryDao(PurchaseEntryDao purchaseEntryDao) {
		this.purchaseEntryDao = purchaseEntryDao;
	}
	
	
}
