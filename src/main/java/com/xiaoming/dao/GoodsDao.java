package com.xiaoming.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.xiaoming.domain.Goods;

public class GoodsDao extends HibernateDaoSupport {

	public Goods get(Integer id) {
		return getHibernateTemplate().get(Goods.class, id);
	}
	
	public Integer save(Goods g) {
		return (Integer)getHibernateTemplate().save(g);
	}
	
	public void update(Goods g) {
		getHibernateTemplate().update(g);
	}
	
	public void delete(Goods g) {
		getHibernateTemplate().delete(g);
	}
	
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<Goods> findAll() {
		return (List<Goods>)getHibernateTemplate().find("from Goods");
	}
}
