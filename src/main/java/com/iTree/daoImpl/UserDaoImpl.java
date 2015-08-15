package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.UserDaoI;
import com.iTree.model.Users;
/**
 * 数据持久化层
 * @author guanjiwei
 *
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<Users> implements UserDaoI {

}
