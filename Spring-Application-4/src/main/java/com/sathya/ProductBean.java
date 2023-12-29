 package com.sathya;

public class ProductBean {
    private int proId;
    private String proName;
    private ModelBean mob;

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public ModelBean getMob() {
        return mob;
    }

    public void setMob(ModelBean mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "ProductBean [proId=" + proId + ", proName=" + proName + ", mob=" + mob + "]";
    }

    public void printProduct() {
        System.out.println("Product is.." + getProId() + " " + getProName());
    }
}
 