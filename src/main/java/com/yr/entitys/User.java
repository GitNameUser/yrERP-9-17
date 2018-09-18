package com.yr.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
 */
@Entity(name="u_user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;//编号
    private String photo;//员工照片
    private String jobNum;//工号
    private String depaCode;//部门编号
    private String name;//姓名
    private Integer sex;//性别
    //定义时间格式	自动更新时间
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date birthday;//生日
    private String addr;//地址
    private String phoneNumber;//联系电话
    private Integer states;//状态
    private String password;//密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getDepaCode() {
        return depaCode;
    }

    public void setDepaCode(String depaCode) {
        this.depaCode = depaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", jobNum='" + jobNum + '\'' +
                ", depaCode='" + depaCode + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", states=" + states +
                ", password='" + password + '\'' +
                '}';
    }
}
