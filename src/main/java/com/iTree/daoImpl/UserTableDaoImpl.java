package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.UserTableDaoI;
import com.iTree.model.UserTable;
@Repository("userTableDao")
public class UserTableDaoImpl extends BaseDaoImpl<UserTable> implements
UserTableDaoI {

}
