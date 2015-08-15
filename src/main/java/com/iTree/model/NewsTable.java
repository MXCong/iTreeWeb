package com.iTree.model;

import java.util.Date;

/**
 * ���Ŷ�̬��
 * @author Fei
 *
 */
public class NewsTable {
	private int NewsID;//����ID/��������
	private String NewsTittle;//����
	private String NewsContent;//����
	private String NewsProfile;//���
	private String NewsAuthor;//����
	private Date NewsDate;//ʱ��
	private int PhotoID;//��Ƭ/���
	private int NewsIdentify;//��ʶ������Ϊ1��������Ϊ0
	
	public NewsTable(){
		
	}

	/***************get/set������ʼ*****************/
	public int getNewsID() {
		return NewsID;
	}

	public void setNewsID(int newsID) {
		NewsID = newsID;
	}

	public String getNewsTittle() {
		return NewsTittle;
	}

	public void setNewsTittle(String newsTittle) {
		NewsTittle = newsTittle;
	}

	public String getNewsContent() {
		return NewsContent;
	}

	public void setNewsContent(String newsContent) {
		NewsContent = newsContent;
	}

	public String getNewsProfile() {
		return NewsProfile;
	}

	public void setNewsProfile(String newsProfile) {
		NewsProfile = newsProfile;
	}

	public String getNewsAuthor() {
		return NewsAuthor;
	}

	public void setNewsAuthor(String newsAuthor) {
		NewsAuthor = newsAuthor;
	}

	public Date getNewsDate() {
		return NewsDate;
	}

	public void setNewsDate(Date newsDate) {
		NewsDate = newsDate;
	}

	public int getPhotoID() {
		return PhotoID;
	}

	public void setPhotoID(int photoID) {
		PhotoID = photoID;
	}

	public int getNewsIdentify() {
		return NewsIdentify;
	}

	public void setNewsIdentify(int newsIdentify) {
		NewsIdentify = newsIdentify;
	}
	/***************get/set��������*****************/
}







