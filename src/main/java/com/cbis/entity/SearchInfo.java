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

    // ���ݳ���վ\����վ���ɳ��β�ѯ,MySQL�õ�������ʽ
    public String getSqlPattern() {
        return start + ".+" + stop;
    }

    // ���ݳ���\����վ�����ɳ�վƥ��,Java��������ʽ
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
