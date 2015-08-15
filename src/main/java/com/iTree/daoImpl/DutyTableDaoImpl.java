package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.DutyTableDaoI;
import com.iTree.model.DutyTable;
@Repository("dutyTableDao")
public class DutyTableDaoImpl extends BaseDaoImpl<DutyTable> implements
		DutyTableDaoI {

}
