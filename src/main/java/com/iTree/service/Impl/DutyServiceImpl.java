package com.iTree.service.Impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iTree.dao.DutyDaoI;
import com.iTree.model.Duty;
import com.iTree.pageModel.DutyPage;
import com.iTree.service.DutyServiceI;

@Service("dutyService")
public class DutyServiceImpl implements DutyServiceI {
	private DutyDaoI dutyDao;
	
	public DutyDaoI getDutyDao() {
		return dutyDao;
	}
	@Autowired
	public void setDutyDao(DutyDaoI dutyDao) {
		this.dutyDao = dutyDao;
	}

	Duty duty = new Duty();

	@Override
	public void save(DutyPage dutyPage) {
		// TODO Auto-generated method stub
		Duty duty = new Duty();
		BeanUtils.copyProperties(dutyPage, duty);
		try{
			dutyDao.save(duty);
			System.out.println("成功");

		}catch(RuntimeException r){
			System.out.println(r.getMessage());
		}
	
	}

	

	@Override
	public List<DutyPage> list(int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DutyPage> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(DutyPage dutyPage) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(DutyPage dutyPage) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public DutyPage listById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
