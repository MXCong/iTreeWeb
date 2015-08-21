package com.iTree.service.Impl;

import javax.annotation.Resource;





import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.iTree.dao.MessageDaoI;
import com.iTree.model.Message;
import com.iTree.pageModel.MessagePage;
import com.iTree.service.MessageServiceI;

@Service("messageService")
public class MessageServiceImpl implements MessageServiceI {
	@Resource
	private MessageDaoI messageDao;

	@Override
	public void save(MessagePage mes) {
		// TODO Auto-generated method stub
		Message message = new Message();
		BeanUtils.copyProperties(mes, message);
		messageDao.save(message);
		
	}

}
