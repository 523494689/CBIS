package com.cbis.entity;

public class OrderFlow {
    private int id;
    private String orderNum;    // 对应单号
    private String op;          // 操作类型
    private String opTime;      // 操作时间
    private int operId;         // 操作者(本人/工作人员)

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

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public int getOperId() {
        return operId;
    }

    public void setOperId(int operId) {
        this.operId = operId;
    }

    @Override
    public String toString() {
        return "OrderFlow{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", op='" + op + '\'' +
                ", opTime='" + opTime + '\'' +
                ", operId=" + operId +
                '}';
    }
}
