package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.RecordDaoI;
import com.iTree.model.Record;
@Repository("recordDao")
public class RecordDaoImpl extends BaseDaoImpl<Record> implements
RecordDaoI {

}
