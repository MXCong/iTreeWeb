package com.iTree.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iTree.dao.TmenuDaoI;
import com.iTree.model.Tmenu;
import com.iTree.pageModel.Menu;
import com.iTree.service.MenuServiceI;

@Service("menuService")
public class MenuServiceImpl implements MenuServiceI {

	private TmenuDaoI tmenuDao;

	public TmenuDaoI getTmenuDao() {
		return tmenuDao;
	}

	@Autowired
	public void setTmenuDao(TmenuDaoI tmenuDao) {
		this.tmenuDao = tmenuDao;
	}
	
	@Override
	public List<Menu> getTree(){
		List<Menu> menul = new ArrayList<Menu>(); 
		List<Tmenu> l = tmenuDao.find("from Tmenu t where id='root'");
		if(l!=null && l.size()>0){
			for(Tmenu T:l){
				Menu menu = new Menu();
				BeanUtils.copyProperties(T, menu);
				if(T.getTmenus()!=null && !T.getTmenus().isEmpty()){
					menu.setState("closed");//设置为文件夹
				}else{
					menu.setState("closed");//设置问文件
				}
				
				menul.add(menu);
			}
			
		}
		return menul;
	}
	

}
