package com.cbis.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SearchInfo implements Serializable {
    private String start;
    private String stop;
    private String date;
//    private String sqlPattern;
//    private String rePattern;

    // 根据出发站\到达站生成车次查询,MySQL用的正则表达式
    public String getSqlPattern() {
        return start + ".+" + stop;
    }

    // 根据出发\到达站点生成车站匹配,Java用正则表达式
    public String getRePattern() {
        return String.format("(%s.*%s.*?\\b)", start, stop);
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public boolean isToday() {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat()
//    }


    @Override
    public String toString() {
        return "SearchInfo{" +
                "start='" + start + '\'' +
                ", stop='" + stop + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
