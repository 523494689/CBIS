package com.cbis.entity;

public class Passenger {
    private int id;
    private int userId;         // 注册用户id
    private String pName;       // 乘客姓名
    private String pIDCard;     // 乘客身份证
    private String pTelphone;   // 乘客联系电话

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpIDCard() {
        return pIDCard;
    }

    public void setpIDCard(String pIDCard) {
        this.pIDCard = pIDCard;
    }

    public String getpTelphone() {
        return pTelphone;
    }

    public void setpTelphone(String pTelphone) {
        this.pTelphone = pTelphone;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", userId=" + userId +
                ", pName='" + pName + '\'' +
                ", pIDCard='" + pIDCard + '\'' +
                ", pTelphone='" + pTelphone + '\'' +
                '}';
    }
}
