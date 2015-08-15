package com.iTree.model;

import java.util.Date;

/**
 * ѧϰ��¼��
 * @author Fei
 *
 */
public class StudyRecord {
	private int RecordID;//��¼ID/��������
	private Date RecordDate;//ʱ��
	private String RecordContent;//����
	private String UserID;//ID/���
	private int FileID;//�ļ�/���
	private int PhotoID;//��Ƭ/���
	
	public StudyRecord(){
		
	}

	/***************get/set������ʼ*****************/
	public int getRecordID() {
		return RecordID;
	}

	public void setRecordID(int recordID) {
		RecordID = recordID;
	}

	public Date getRecordDate() {
		return RecordDate;
	}

	public void setRecordDate(Date recordDate) {
		RecordDate = recordDate;
	}

	public String getRecordContent() {
		return RecordContent;
	}

	public void setRecordContent(String recordContent) {
		RecordContent = recordContent;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public int getFileID() {
		return FileID;
	}

	public void setFileID(int fileID) {
		FileID = fileID;
	}

	public int getPhotoID() {
		return PhotoID;
	}

	public void setPhotoID(int photoID) {
		PhotoID = photoID;
	}
	/***************get/set��������*****************/
}





