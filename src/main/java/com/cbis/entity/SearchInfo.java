package com.cbis.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SearchInfo implements Serializable {
    private String start;
    private String stop;
    private String date;
//    private String sqlPattern;
//    private String rePattern;

    // �жϲ�ѯ����,��������ǵ��췵��0,���ڴ��ڵ��췵��1;����С�ڵ��췵��-1
    public int compareToday() {
        if (date == null || date.equals("")) {
            return 0;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date searchDate = null;
        Date today = null;

        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int mm = c.get(Calendar.MONTH) + 1;
        int dd = c.get(Calendar.DAY_OF_MONTH);

        String todayStr = String.format("%02d/%02d/%04d", mm, dd, year);

        try {
            searchDate = simpleDateFormat.parse(date);
            today = simpleDateFormat.parse(todayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return searchDate.compareTo(today);
    }

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
