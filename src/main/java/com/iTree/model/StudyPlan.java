package com.iTree.model;

import java.util.Date;

/**
 * ���˹滮��
 * @author Fei
 *
 */
public class StudyPlan {
	private int PlanID;//�滮ID/����
	private String UserID;//ID/���
	private String PlanContent;//�ƻ�����
	private Date PlanStart;//�ƻ���ʼʱ��
	private Date PlanEnd;//�ƻ�����ʱ��
	private Date PlanDate;//���¼�¼ʱ��
	private int PlanParent;//����
	private int PlanCompared;//���,1Ϊ����ɣ�0Ϊ�����
	
	public int getPlanID() {
		return PlanID;
	}

	/***************get/set������ʼ*****************/
	public void setPlanID(int planID) {
		PlanID = planID;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getPlanContent() {
		return PlanContent;
	}

	public void setPlanContent(String planContent) {
		PlanContent = planContent;
	}

	public Date getPlanStart() {
		return PlanStart;
	}

	public void setPlanStart(Date planStart) {
		PlanStart = planStart;
	}

	public Date getPlanEnd() {
		return PlanEnd;
	}

	public void setPlanEnd(Date planEnd) {
		PlanEnd = planEnd;
	}

	public Date getPlanDate() {
		return PlanDate;
	}

	public void setPlanDate(Date planDate) {
		PlanDate = planDate;
	}

	public int getPlanParent() {
		return PlanParent;
	}

	public void setPlanParent(int planParent) {
		PlanParent = planParent;
	}

	public int getPlanCompared() {
		return PlanCompared;
	}

	public void setPlanCompared(int planCompared) {
		PlanCompared = planCompared;
	}

	public StudyPlan(){
		
	}
	/***************get/set��������*****************/
}







