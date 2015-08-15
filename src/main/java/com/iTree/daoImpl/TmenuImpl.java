package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.TmenuDaoI;
import com.iTree.model.Tmenu;
@Repository("tmenuDao")
public class TmenuImpl extends BaseDaoImpl<Tmenu> implements TmenuDaoI {	

}
