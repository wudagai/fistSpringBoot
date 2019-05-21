package com.springboot.entity;

public class User {
    private Integer userId;
    private String userName;
    private String realName;
    private String password;
    private String userSex;
    private String userPhone;
    private String userAddress;
    private String mooto;
    private String userStat;

    public User() {
    }

    public User(Integer userId, String userName,
                String realName, String password,
                String userSex, String userPhone,
                String userAddress, String mooto, String userStat) {
        this.userId = userId;
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.mooto = mooto;
        this.userStat = userStat;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getMooto() {
        return mooto;
    }

    public void setMooto(String mooto) {
        this.mooto = mooto;
    }

    public String getUserStat() {
        return userStat;
    }

    public void setUserStat(String userStat) {
        this.userStat = userStat;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", mooto='" + mooto + '\'' +
                ", userStat='" + userStat + '\'' +
                '}';
    }
}
