package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.StudyRecordDaoI;
import com.iTree.model.StudyRecord;
@Repository("studyRecordDao")
public class StudyRecordDaoImpl extends BaseDaoImpl<StudyRecord> implements
StudyRecordDaoI {

}
