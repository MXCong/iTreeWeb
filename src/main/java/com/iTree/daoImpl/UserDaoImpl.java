package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.UserDaoI;
import com.iTree.model.Users;


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<Users> implements UserDaoI {

}
