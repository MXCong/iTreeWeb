package com.iTree.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.iTree.service.MenuServiceI;

@Action("menuAction")
public class MenuAction extends BaseAction {
	private MenuServiceI menuService;
	
	public MenuServiceI getMenuService() {
		return menuService;
	}
	@Autowired
	public void setMenuService(MenuServiceI menuService) {
		this.menuService = menuService;
	}

	public void getTree(){
		super.writeJson(menuService.getTree());
	}
}
