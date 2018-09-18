package com.yr.entitys.bo;

/**
 *仓库实体类
 */

public class Depot {
    private int id;
    private String code;
    private String name;
    private String addr;
    private String jobnum;//仓库负责人工号

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

    @Override
    public String toString() {
        return "Depot{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", jobnum='" + jobnum + '\'' +
                '}';
    }
}
