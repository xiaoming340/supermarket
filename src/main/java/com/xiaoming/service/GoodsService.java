package com.xiaoming.service;

import java.util.List;

import com.xiaoming.dao.GoodsDao;
import com.xiaoming.domain.Goods;

public class GoodsService {

	private GoodsDao goodsDao;

	public GoodsDao getGoodsDao() {
		return goodsDao;
	}

	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	
	public List<Goods> findAll() {
		return goodsDao.findAll();
	}
}
