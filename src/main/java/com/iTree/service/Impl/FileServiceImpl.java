package com.iTree.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.iTree.dao.FileDaoI;
import com.iTree.model.File;
import com.iTree.pageModel.FilePage;
import com.iTree.service.FileServiceI;



@Service("fileService")
public class FileServiceImpl implements FileServiceI{
	@Resource
	private FileDaoI fileDao;

	File file = new File();
	
@Override
	public void save(FilePage table) {
		BeanUtils.copyProperties(table, file);
		fileDao.save(file);
	}

	@Override
	public void update(FilePage table) {
		BeanUtils.copyProperties(table, file);
		fileDao.update(file);
	}

	@Override
	public void delete(FilePage table) {
		BeanUtils.copyProperties(table, file);
		fileDao.delete(file);
	}

	@Override
	public List<FilePage> list(int page, int rows) {
		return null;
	}

	@Override
	public List<FilePage> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File listById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
