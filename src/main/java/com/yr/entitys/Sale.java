package com.yr.entitys;

public class Sale {
    private Integer id;
    private String code;
    private String customerBuy;
    private String salesperson;
    private String wareCode;
    private long number;
    private Double money;
    private String sPhoneNumber;
    private String remark;
    private Integer states;
    private String approver;
    private String requName;
    private String rPhoneNumber;
    private String depotCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomerBuy() {
        return customerBuy;
    }

    public void setCustomerBuy(String customerBuy) {
        this.customerBuy = customerBuy;
    }

    public String getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(String salesperson) {
        this.salesperson = salesperson;
    }

    public String getWareCode() {
        return wareCode;
    }

    public void setWareCode(String wareCode) {
        this.wareCode = wareCode;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getsPhoneNumber() {
        return sPhoneNumber;
    }

    public void setsPhoneNumber(String sPhoneNumber) {
        this.sPhoneNumber = sPhoneNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getRequName() {
        return requName;
    }

    public void setRequName(String requName) {
        this.requName = requName;
    }

    public String getrPhoneNumber() {
        return rPhoneNumber;
    }

    public void setrPhoneNumber(String rPhoneNumber) {
        this.rPhoneNumber = rPhoneNumber;
    }

    public String getDepotCode() {
        return depotCode;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", customerBuy='" + customerBuy + '\'' +
                ", salesperson='" + salesperson + '\'' +
                ", wareCode='" + wareCode + '\'' +
                ", number=" + number +
                ", money=" + money +
                ", sPhoneNumber='" + sPhoneNumber + '\'' +
                ", remark='" + remark + '\'' +
                ", states=" + states +
                ", approver='" + approver + '\'' +
                ", requName='" + requName + '\'' +
                ", rPhoneNumber='" + rPhoneNumber + '\'' +
                ", depotCode='" + depotCode + '\'' +
                '}';
    }
}