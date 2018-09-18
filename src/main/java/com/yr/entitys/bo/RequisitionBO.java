package com.yr.entitys.bo;

import com.yr.entitys.Requisition;

public class RequisitionBO {
    private Requisition requisition;
    //采购商品名称
    private String  purchaseName;
    //采购商品类型
    private String purchaseType;

    public void setRequisition(Requisition requisition) {
        this.requisition = requisition;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public Requisition getRequisition() {
        return requisition;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public String getPurchaseType() {
        return purchaseType;
    }
}
