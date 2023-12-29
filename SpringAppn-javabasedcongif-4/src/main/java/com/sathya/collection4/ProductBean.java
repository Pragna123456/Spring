package com.sathya.collection4;

import java.util.List;

public class ProductBean {
	private  int productId;
	private String productName;
	List<ModelBean>modelObjs;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<ModelBean> getModelObjs() {
		return modelObjs;
	}
	public void setModelObjs(List<ModelBean> modelObjs) {
		this.modelObjs = modelObjs;
	}
	public void printProduct()
	{
        System.out.println("Product is.." + getProductId() + " " + getProductName());

	}

}
