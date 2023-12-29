package com.sathya;

public class ModelBean {
    private int modelId;
    private String modelCode;
    private double modelPrice;
    private MarginBean mgOb;

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

    public MarginBean getMgOb() {
        return mgOb;
    }

    public void setMgOb(MarginBean mgOb) {
        this.mgOb = mgOb;
    }

    @Override
    public String toString() {
        return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelPrice=" + modelPrice + "]";
    }
}