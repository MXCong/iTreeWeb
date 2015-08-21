package com.iTree.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;



public interface BaseDaoI<T> {
	
	public Serializable save(T o);//保存某个对象
	
	public void delete(T o);//删除某对象
	
	public void update(T o);//更新
	
	public void saveOrUpdata(T o);//删除或更新
	
	public T login(String hql);//登陆用

	public T login(String hql,Map<String,Object> params);//指定条件搜索
	
	public T findById(Class<T> class1,String id);//通过字符串ID查询某表的全部信息
	
	public T findById(Class<T> class1,int id);//通过整形ID查询某表的全部信息
	
	public List<T> find(String hql);//hql语句查询
	
	public List<T> findAll(String table);//通过表名查询 全部表信息。
	
	public List<T> find(String hql,int page,int rows);//全表的分页查询
	
	public List<T> find(String hql,Map<String,Object> params);//通过语句及键值对查询
	
	public List<T> find(String hql,Map<String,Object> params,int page,int rows);//分页查询使用
	
	public Long count(String table);//查询某表的全部信息条数
	
	public Long count(String hql,Map<String,Object> params);//查询某表的某条件下的信息条数
	
	
	public T get(String hql,Map<String,Object> params);
	
	
}
