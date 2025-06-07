package com.neusoft.nep.entity;

import java.io.Serializable;

public class User implements Serializable {
    private  String phonenumber;
    private  String userName;
    private  String remark;
    private  String bath;
    private String password;
    private String repassword;

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public User(String phonenumber, String userName, String bath, String password, String repassword, String remark) {
        this.phonenumber = phonenumber;
        this.userName = userName;
        this.bath = bath;
        this.password = password;
        this.repassword = repassword;
        this.remark = remark;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
