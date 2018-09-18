package com.yr.entitys;

import java.util.Date;

public class Depot {
    private int id;
    private String code;
    private String name;
    private String addr;
    private String jobnum;//仓库负责人工号
    private Date createTime;
    private String createEmpno;
    private Date updateTime;
    private String updateEmpno;

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getJobnum() {
        return jobnum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setJobnum(String jobnum) {
        this.jobnum = jobnum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateEmpno() {
        return createEmpno;
    }

    public void setCreateEmpno(String createEmpno) {
        this.createEmpno = createEmpno;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateEmpno() {
        return updateEmpno;
    }

    public void setUpdateEmpno(String updateEmpno) {
        this.updateEmpno = updateEmpno;
    }

    @Override
    public String toString() {
        return "Depot{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", jobnum='" + jobnum + '\'' +
                ", createTime=" + createTime +
                ", createEmpno='" + createEmpno + '\'' +
                ", updateTime=" + updateTime +
                ", updateEmpno='" + updateEmpno + '\'' +
                '}';
    }
}

