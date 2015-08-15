package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.TheTeacherWroteDaoI;
import com.iTree.model.TheTeacherWrote;
@Repository("theTeacherWroteDao")
public class TheTeacherWroteDaoImpl extends BaseDaoImpl<TheTeacherWrote> implements
TheTeacherWroteDaoI {

}
