package com.sathya.collection4;

import java.util.Map;


public class ModelBean {
	 private int modelId;
	    private String modelCode;
	    private double modelPrice;
	    Map<String, MarignBean> marginmgOb;		
	    public int getModelId() {
			return modelId;
		}
		public void setModelId(int modelId) {
			this.modelId = modelId;
		}
		public String getModelCode() {
			return modelCode;
		}
		public void setModelCode(String modelCode) {
			this.modelCode = modelCode;
		}
		public double getModelPrice() {
			return modelPrice;
		}
		public void setModelPrice(double modelPrice) {
			this.modelPrice = modelPrice;
		}
		public Map<String, MarignBean> getMarginmgOb() {
			return marginmgOb;
		}
		public void setMarginmgOb(Map<String, MarignBean> marginmgOb) {
			this.marginmgOb = marginmgOb;
		}
		@Override
		public String toString() {
			return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelPrice=" + modelPrice
					+ ", marginmgOb=" + marginmgOb + "]";
		}
		
}