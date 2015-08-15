package com.iTree.model;
/**
 * ��ʦ�����
 * @author Fei
 *
 */
public class TheTeacherWrote {
	private int ContentID;//����ID/��������
	private String TeacherContent;//��������
	private String UserID;//ID/���
	
	public TheTeacherWrote(){
		
	}

	/***************get/set������ʼ*****************/
	public int getContentID() {
		return ContentID;
	}

	public void setContentID(int contentID) {
		ContentID = contentID;
	}

	public String getTeacherContent() {
		return TeacherContent;
	}

	public void setTeacherContent(String teacherContent) {
		TeacherContent = teacherContent;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}
	/***************get/set��������*****************/
}


