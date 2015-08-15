package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.StudyPlanDaoI;
import com.iTree.model.StudyPlan;
@Repository("studyPlanDao")
public class StudyPlanDaoImpl extends BaseDaoImpl<StudyPlan> implements
StudyPlanDaoI {

}
