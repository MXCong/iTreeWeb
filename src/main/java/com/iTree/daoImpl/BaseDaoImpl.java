package com.iTree.daoImpl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iTree.dao.BaseDaoI;

@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDaoI<T> {
	private SessionFactory sessionfaction;

	public SessionFactory getSessionfaction() {
		return sessionfaction;
	}

	public Session getCurrentSession() {// 返回自制函数
		return this.sessionfaction.getCurrentSession();
	}

	@Autowired
	public void setSessionfaction(SessionFactory sessionfaction) {
		this.sessionfaction = sessionfaction;
	}

	@Override
	public Serializable save(T o) {
		// TODO Auto-generated method stub
		return this.getCurrentSession().save(o);
	}

	@Override
	public T login(String hql) {
		Query q = this.getCurrentSession().createQuery(hql);
		List<T> list = q.list();
		if (list != null & list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public T login(String hql, Map<String, Object> params) {
		Query q = this.getCurrentSession().createQuery(hql);
		if (params != null & !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		List<T> list = q.list();
		if (list != null & list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void delete(T o) {
		this.getCurrentSession().delete(o);
	}

	@Override
	public void update(T o) {
		this.getCurrentSession().update(o);
	}

	@Override
	public void saveOrUpdata(T o) {
		this.getCurrentSession().saveOrUpdate(o);
	}

	@Override
	public List<T> find(String hql) {
		Query q = this.getCurrentSession().createQuery(hql);
		return q.list();
	}

	@Override
	public List<T> find(String hql, Map<String, Object> params) {
		Query q = this.getCurrentSession().createQuery(hql);
		if (params != null & !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return q.list();
	}

	@Override
	public List<T> find(String hql, Map<String, Object> params, int page,
			int rows) {
		Query q = this.getCurrentSession().createQuery(hql);
		if (params != null & !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}

		}
		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}

	@Override
	public List<T> find(String hql, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count(String table) {
		String hql = "select count(tb) from " + table + "tb";
		Query q = this.getCurrentSession().createQuery(hql);
		return (Long) q.uniqueResult();
	}

	@Override
	public Long count(String hql, Map<String, Object> params) {
		Query q = this.getCurrentSession().createQuery(hql);
		if (params != null & !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return (Long) q.uniqueResult();
	}

	@Override
	public List<T> findAll(String table) {
		// TODO Auto-generated method stub
		String hql = "from " + table;
		Query q = this.getCurrentSession().createQuery(hql);
		// q.setParameter(0, o);
		return q.list();
	}


	@Override
	public T get(String hql, Map<String, Object> params) {
		Query q = this.getCurrentSession().createQuery(hql);
		if (params != null & !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		List<T> list = q.list();
		if (list != null & list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

	@Override
	public T findById(Class<T> class1, String id) {

		return (T) this.getCurrentSession().get(class1, id);

	}

	@Override
	public T findById(Class<T> class1, int id) {

		return (T) this.getCurrentSession().load(class1, id);

	}

}
