package com.iTree.model;
/**
 * ְ���
 * @author Fei
 *
 */
public class DutyTable {
	private String DutyID;//ְ��ID/����,���磺D1
	private String Duty;//ְ��
	private int DutyIdentify;//��ʶ��1��ʾ���ã�0��ʾ�����ã�
	
	public DutyTable(){
		
	}
	
	/***************get/set������ʼ*****************/
	public String getDutyID() {
		return DutyID;
	}

	public void setDutyID(String dutyID) {
		DutyID = dutyID;
	}

	public String getDuty() {
		return Duty;
	}

	public void setDuty(String duty) {
		Duty = duty;
	}

	public int getDutyIdentify() {
		return DutyIdentify;
	}

	public void setDutyIdentify(int dutyIdentify) {
		DutyIdentify = dutyIdentify;
	}
	/***************get/set��������*****************/
}
