package com.example.aartilakkad.myapplication.Fiat;

public class model_task {

    int image;
    String no,time,date,address;

    public model_task(int download, String s, String s1, String s2, String s3) {

        this.image = image;
        this.no = no;
        this.time = time;
        this.date = date;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
