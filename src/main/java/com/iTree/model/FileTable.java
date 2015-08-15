package com.iTree.model;

import java.util.Date;

/**
 * �ļ���
 * @author Fei
 *
 */
public class FileTable {
	private int FileID;//ID/����,����
	private String FileProfile;//���
	private String FileTittle;//����
	private String FilePath;//·��
	private String UserID;//����
	private int PhotoID;//��Ƭ/���
	private String FileType;//�ļ�����
	private Date UploadTime;//�ļ��ϴ�ʱ��
	
	public FileTable(){
		
	}

	/***************get/set������ʼ*****************/
	public int getFileID() {
		return FileID;
	}

	public void setFileID(int fileID) {
		FileID = fileID;
	}

	public String getFileProfile() {
		return FileProfile;
	}

	public void setFileProfile(String fileProfile) {
		FileProfile = fileProfile;
	}

	public String getFileTittle() {
		return FileTittle;
	}

	public void setFileTittle(String fileTittle) {
		FileTittle = fileTittle;
	}

	public String getFilePath() {
		return FilePath;
	}

	public void setFilePath(String filePath) {
		FilePath = filePath;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public int getPhotoID() {
		return PhotoID;
	}

	public void setPhotoID(int photoID) {
		PhotoID = photoID;
	}

	public String getFileType() {
		return FileType;
	}

	public void setFileType(String fileType) {
		FileType = fileType;
	}

	public Date getUploadTime() {
		return UploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		UploadTime = uploadTime;
	}
	/***************get/set��������*****************/
}







