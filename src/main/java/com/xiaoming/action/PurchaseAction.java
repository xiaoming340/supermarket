package com.xiaoming.action;

import java.math.BigDecimal;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaoming.domain.Goods;
import com.xiaoming.service.GoodsService;
import com.xiaoming.service.PurchaseService;

public class PurchaseAction extends ActionSupport {
	
	private static final long serialVersionUID = 47L;
	
	public static class PurchaseTV {
		public Integer id;
		public String name;
		public Integer stockNum;
		public Integer saleNum;
		public Integer purchaseNum;
		public BigDecimal price;
		public BigDecimal totalPrice;
		
		public PurchaseTV() {
			
		}

		public PurchaseTV(Integer id, String name, Integer stockNum, Integer saleNum, Integer purchaseNum,
				BigDecimal price, BigDecimal totalPrice) {
			super();
			this.id = id;
			this.name = name;
			this.stockNum = stockNum;
			this.saleNum = saleNum;
			this.purchaseNum = purchaseNum;
			this.price = price;
			this.totalPrice = totalPrice;
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

		public Integer getStockNum() {
			return stockNum;
		}

		public void setStockNum(Integer stockNum) {
			this.stockNum = stockNum;
		}

		public Integer getSaleNum() {
			return saleNum;
		}

		public void setSaleNum(Integer saleNum) {
			this.saleNum = saleNum;
		}

		public Integer getPurchaseNum() {
			return purchaseNum;
		}

		public void setPurchaseNum(Integer purchaseNum) {
			this.purchaseNum = purchaseNum;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public BigDecimal getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(BigDecimal totalPrice) {
			this.totalPrice = totalPrice;
		}	
	}
	
	public PurchaseService purchaseService;
	public GoodsService goodsService;
	
	public List<Goods> goods;
	public Integer gId;
	public String gName;
	
	public PurchaseService getPurchaseService() {
		return purchaseService;
	}

	public void setPurchaseService(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}
	
	public GoodsService getGoodsService() {
		return goodsService;
	}

	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	
	
	
	public String execute() throws Exception {
		System.out.println("enter purchase action");
		goods = goodsService.findAll();
		if(goods == null) {
			System.out.println("g is null");
		}
		return SUCCESS;
	}
}

/*class GoodsTV {
	public Integer id;
	public String name;
	
	public GoodsTV() {
		
	}	
	
	public GoodsTV(Integer id, String name) {
		this.id = id;
		this.name = name;
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
}*/
