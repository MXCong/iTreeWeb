package com.iTree.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iTree.dao.MenuDaoI;
import com.iTree.model.Menu;
import com.iTree.pageModel.MenuPage;
import com.iTree.service.MenuServiceI;

@Service("menuService")
/**
 * 
 * @author guanjiwei
 *menu表存在问题，需要更正
 */
public class MenuServiceImpl implements MenuServiceI {

	private MenuDaoI MenuDao;

	public MenuDaoI getMenuDao() {
		return MenuDao;
	}

	@Autowired
	public void setMenuDao(MenuDaoI MenuDao) {
		this.MenuDao = MenuDao;
	}
	
	@Override
	public List<MenuPage> getTree(){
		List<MenuPage> menul = new ArrayList<MenuPage>(); 
		List<Menu> l = MenuDao.find("from Menu t where id='root'");
		if(l!=null && l.size()>0){
			for(Menu T:l){
				MenuPage menu = new MenuPage();
				BeanUtils.copyProperties(T, menu);
				/*if(T.getMenus()!=null && !T.getMenus().isEmpty()){
					menu.setState("closed");//设置为文件夹
				}else{
					menu.setState("closed");//设置问文件
				}*/
				
				menul.add(menu);
			}
			
		}
		return menul;
	}
	

}
