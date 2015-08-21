package com.iTree.daoImpl;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.iTree.dao.FileDaoI;
import com.iTree.model.File;

@Repository("fileDao")
public class FileDaoImpl extends BaseDaoImpl<File> implements
		FileDaoI {

	@Override
	public File findByPath(String filePath) {
		if(filePath != null || filePath.length() == 0){//逻辑有问题
			String hql = "from File  where  FilePath= ?";
			Query q = super.getCurrentSession().createQuery(hql);
			q.setParameter(0, filePath);		
			return (File) q.uniqueResult();
		}else{
			return null;
		}
		
	}
	
	
}
