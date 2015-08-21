package com.iTree.service;

import java.util.List;

import com.iTree.model.File;
import com.iTree.pageModel.FilePage;

public interface FileServiceI {

	public void save(FilePage filePage);//增加

	public void update(FilePage filePage);//更新

	public void delete(FilePage filePage);//删除

	public List<FilePage> list(int page, int rows);//分页获取职责

	public List<FilePage> listAll();//获取全部职责
	
	public File listById(String id);//按ID获取一个职责
}
