package com.iTree.daoImpl;

import org.springframework.stereotype.Repository;

import com.iTree.dao.MessageDaoI;
import com.iTree.model.Message;
@Repository("messageDao")
public class MessageDaoImpl extends BaseDaoImpl<Message> implements
MessageDaoI {

}
