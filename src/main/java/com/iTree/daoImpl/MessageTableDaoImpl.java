package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.MessageTableDaoI;
import com.iTree.model.MessageTable;
@Repository("messageTableDao")
public class MessageTableDaoImpl extends BaseDaoImpl<MessageTable> implements
MessageTableDaoI {

}
