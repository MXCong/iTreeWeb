package com.iTree.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDaoI<T> {
	
	public Serializable save(T o);
	
	public void delete(T o);
	
	public void updata(T o);
	
	public void saveOrUpdata(T o);
	
	public T login(String hql);

	public T login(String hql,Map<String,Object> params);
	
//	public T findById(int id);
	
	public List<T> find(String hql);
	
	public List<T> find(String hql,int page,int rows);
	
	public List<T> find(String hql,Map<String,Object> params);
	
	public List<T> find(String hql,Map<String,Object> params,int page,int rows);
	
	public Long count(String hql);
	
	public Long count(String hql,Map<String,Object> params);
	
	
}
