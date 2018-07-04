package com.cbis.entity;

public class Orders {
    private int id;
    private String orderNum;    // 单号
    private int userId;         // 下单人id
    private Integer trainId;    // 车次id
    private Integer startNo;    // 出发站序号
    private Integer stopNo;     // 到达站序号
    private int passId;         // 乘客id
    private String orderTime;   // 下单时间
    private Integer state;      // 订单状态

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getStartNo() {
        return startNo;
    }

    public void setStartNo(int startNo) {
        this.startNo = startNo;
    }

    public int getStopNo() {
        return stopNo;
    }

    public void setStopNo(int stopNo) {
        this.stopNo = stopNo;
    }

    public int getPassId() {
        return passId;
    }

    public void setPassId(int passId) {
        this.passId = passId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", userId=" + userId +
                ", trainId=" + trainId +
                ", startNo=" + startNo +
                ", stopNo=" + stopNo +
                ", passId=" + passId +
                ", orderTime='" + orderTime + '\'' +
                ", state=" + state +
                '}';
    }
}
