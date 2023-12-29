package com.sathya.collection4;



public class ModelBean {
	private int mId;
	private String mName;
	private double mPrice;
	private String mCompany;
	
	public ModelBean(int mId, String mName, double mPrice, String mCompany) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mPrice = mPrice;
		this.mCompany = mCompany;
	}
	
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public double getmPrice() {
		return mPrice;
	}
	public void setmPrice(double mPrice) {
		this.mPrice = mPrice;
	}
	public String getmCompany() {
		return mCompany;
	}
	public void setmCompany(String mCompany) {
		this.mCompany = mCompany;
	}
	
	@Override
	public String toString() {
		return "ModelBean [mId=" + mId + ", mName=" + mName + ", mPrice=" + mPrice + ", mCompany=" + mCompany + "]";
	}
	
	
	
}