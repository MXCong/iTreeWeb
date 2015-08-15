package com.iTree.model;

import java.util.Date;

/**
 * ���Ա�
 * @author Fei
 *
 */
public class MessageTable {
	private int MessageID;//����ID/��������
	private String MessageContent;//����
	private Date MessageDate;//ʱ��
	private String MessageName;//����
	private String MessageTel;//��ϵ��ʽ
	
	public MessageTable(){
		
	}

	/***************get/set������ʼ*****************/
	public int getMessageID() {
		return MessageID;
	}

	public void setMessageID(int messageID) {
		MessageID = messageID;
	}

	public String getMessageContent() {
		return MessageContent;
	}

	public void setMessageContent(String messageContent) {
		MessageContent = messageContent;
	}

	public Date getMessageDate() {
		return MessageDate;
	}

	public void setMessageDate(Date messageDate) {
		MessageDate = messageDate;
	}

	public String getMessageName() {
		return MessageName;
	}

	public void setMessageName(String messageName) {
		MessageName = messageName;
	}

	public String getMessageTel() {
		return MessageTel;
	}

	public void setMessageTel(String messageTel) {
		MessageTel = messageTel;
	}
	/***************get/set��������*****************/
}




