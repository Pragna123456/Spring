package com.sathya.collection4;

import java.util.List;
import java.util.Map;

public class ProductBean {
	
	private int pId;
	private String pName;
	private Map<String, Integer> myMap;
	private List<ModelBean>modelObj;
	public ProductBean() {
		super();
	}
	public ProductBean(int pId, String pName, Map<String, Integer> myMap, List<ModelBean> modelObj) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.myMap = myMap;
		this.modelObj = modelObj;
	}
	public void printProdutcs()
	{
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(myMap);
		System.out.println(modelObj);

	}
	
}
