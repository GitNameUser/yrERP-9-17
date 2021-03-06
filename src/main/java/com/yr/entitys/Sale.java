package com.yr.entitys;

import javax.persistence.*;
import java.util.Date;

@Table(name="sale_order")
@Entity
public class Sale {
    //销售订单id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name="id")
    private Integer id;

    //销售订单编号(唯一)
    @Column(unique = true)
    private String code;

    //购买客户
    @Column(name = "customer_buy")
    private String customerBuy;

    //销售员
    @Column(name = "sales_person")
    private String salesperson;

    //销售商品编号
    @Column(name = "ware_code")
    private String wareCode;

    //销售商品数量
    private long number;

    //销售金额
    private Double money;

    //销售员联系电话
    @Column(name = "s_phoneNumber")
    private String sPhoneNumber;

    //备注
    private String remark;

    //销售单状态（0退货，1交易成功）
    private Integer states;

    //审批人
    private String approver;

    //申请退货人姓名
    @Column(name = "requ_name")
    private String requName;

    //申请退货人联系电话
    @Column(name = "r_phoneNumber")
    private String rPhoneNumber;

    //销售商品的仓库编号
    @Column(name = "depot_code")
    private String depotCode;

    //创建时间
    @Temporal(TemporalType.TIMESTAMP)//(默认年月日时分秒)

    @Column(name = "CreateTime")
    private Date createTime;

    //创建人
    @Column(name = "create_Emp")
    private String createEmp;

    //修改时间
    @Temporal(TemporalType.TIMESTAMP)//(默认年月日时分秒)
    @Column(name = "update_time")
    private Date updateTime;

    //修改人
    @Column(name = "update_Emp")
    private String updateEmp;


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