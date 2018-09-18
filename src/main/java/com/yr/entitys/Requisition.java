package com.yr.entitys;
import com.google.common.collect.Lists;

import javax.persistence.Column;

public class Requisition {
    private Integer id;

    private String code;

    //申请编号
    @Column(name = "job_num")
    private String jobNumber;

    //申请人工号
    @Column(name = "depa_code")
    private String departmentCode;
    //审批人
    private String approver;

    //采购商品名称
    @Column(name = "purc_ware_name")
    private String purchaseGood;

    //采购商品类型
    @Column(name = "purc_ware_type")
    private String purchaseType;

    //采购商品数量
    @Column(name = "purc_ware_num")
    private Long purchaseNumber;

    //供应商编号
    @Column(name = "supp_code")
    private String supplierCode;

    //单价

    @Column(name = "unit_price")
    private Double unitPrice;

    //总价
    @Column(name = "total_price")
    private  Double totalPrice;

    //采购单状态(0驳回，1交易成功，2待审核，3申请退货，4退货成功)
    private  Integer status;

    //收货人
    private  String consignee;

    //收货仓库id;
    @Column(name = "depot_code")
    private String  depotCode;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public void setPurchaseGood(String purchaseGood) {
        this.purchaseGood = purchaseGood;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public void setPurchaseNumber(Long purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getApprover() {
        return approver;
    }

    public String getPurchaseGood() {
        return purchaseGood;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public Long getPurchaseNumber() {
        return purchaseNumber;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getDepotCode() {
        return depotCode;
    }

    public Requisition() {

    }

    public Requisition(Integer id, String code, String jobNumber, String departmentCode, String approver, String purchaseGood, String purchaseType, Long purchaseNumber, String supplierCode, Double unitPrice, Double totalPrice, Integer status, String consignee, String depotCode) {
        this.id = id;
        this.code = code;
        this.jobNumber = jobNumber;
        this.departmentCode = departmentCode;
        this.approver = approver;
        this.purchaseGood = purchaseGood;
        this.purchaseType = purchaseType;
        this.purchaseNumber = purchaseNumber;
        this.supplierCode = supplierCode;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.status = status;
        this.consignee = consignee;
        this.depotCode = depotCode;
    }

    @Override
    public String toString() {
        return "Requisition{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", jobNumber='" + jobNumber + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", approver='" + approver + '\'' +
                ", purchaseGood='" + purchaseGood + '\'' +
                ", purchaseType='" + purchaseType + '\'' +
                ", purchaseNumber=" + purchaseNumber +
                ", supplierCode='" + supplierCode + '\'' +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", consignee='" + consignee + '\'' +
                ", depotCode='" + depotCode + '\'' +
                '}';
    }
}
