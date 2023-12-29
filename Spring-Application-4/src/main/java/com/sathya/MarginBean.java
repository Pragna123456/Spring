package com.sathya;

public class MarginBean {
    private int marginId;
    private String marginCode;

    public int getMarginId() {
        return marginId;
    }

    public void setMarginId(int marginId) {
        this.marginId = marginId;
    }

    public String getMarginCode() {
        return marginCode;
    }

    public void setMarginCode(String marginCode) {
        this.marginCode = marginCode;
    }

    @Override
    public String toString() {
        return "MarginBean [marginId=" + marginId + ", marginCode=" + marginCode + "]";
    }
}