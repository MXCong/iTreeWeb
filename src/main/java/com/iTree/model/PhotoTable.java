package com.iTree.model;
/**
 * ͼƬ��
 * @author Fei
 *
 */
public class PhotoTable {
	private int PhotoID;//ID/����,����
	private String PhotoProfile;//��Ƭ���
	private String StoragePath;//�洢·��
	
	public PhotoTable(){
		
	}

	/***************get/set������ʼ*****************/
	public int getPhotoID() {
		return PhotoID;
	}

	public void setPhotoID(int photoID) {
		PhotoID = photoID;
	}

	public String getPhotoProfile() {
		return PhotoProfile;
	}

	public void setPhotoProfile(String photoProfile) {
		PhotoProfile = photoProfile;
	}

	public String getStoragePath() {
		return StoragePath;
	}

	public void setStoragePath(String storagePath) {
		StoragePath = storagePath;
	}
	/***************get/set��������*****************/
}


