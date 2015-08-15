package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.NewsTableDaoI;
import com.iTree.model.NewsTable;
@Repository("newsTableDao")
public class NewsTableDaoImpl extends BaseDaoImpl<NewsTable> implements
NewsTableDaoI {

}
