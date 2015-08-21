package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.MenuDaoI;
import com.iTree.model.Menu;
@Repository("menuDao")
public class MenuImpl extends BaseDaoImpl<Menu> implements MenuDaoI {	

}
