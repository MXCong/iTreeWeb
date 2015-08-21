package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.DutyDaoI;
import com.iTree.model.Duty;


@Repository("dutyDao")
public class DutyDaoImpl extends BaseDaoImpl<Duty> implements DutyDaoI {

}
