package com.iTree.service;

import java.util.List;

import com.iTree.pageModel.DutyPage;

public interface DutyServiceI {
	
	public void save(DutyPage dutyPage);//增加

	public void update(DutyPage dutyPage);//更新

	public void delete(DutyPage dutyPage);//删除

	public List<DutyPage> list(int page, int rows);//分页获取职责

	public List<DutyPage> listAll();//获取全部职责
	
	public DutyPage listById(String id);//按ID获取一个职责
}
