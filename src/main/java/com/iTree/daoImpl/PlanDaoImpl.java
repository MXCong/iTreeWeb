package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.PlanDaoI;
import com.iTree.model.Plan;
@Repository("planDao")
public class PlanDaoImpl extends BaseDaoImpl<Plan> implements
PlanDaoI {

}
