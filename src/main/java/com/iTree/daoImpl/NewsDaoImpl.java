package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.NewsDaoI;
import com.iTree.model.News;
@Repository("newsDao")
public class NewsDaoImpl extends BaseDaoImpl<News> implements
NewsDaoI {

}
