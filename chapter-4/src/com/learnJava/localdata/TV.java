package com.learnJava.localdata;

/**
 * Created by z001qgd on 12/25/17.
 */
public class TV {

    private String type;
    private int tvSize;

    public TV(String type, int tvSize) {
        this.type = type;
        this.tvSize = tvSize;
    }
    public TV(int tvSize, String type) {
        this.type = type;
        this.tvSize = tvSize;
    }

    public void start(){

        int channel =0;
        type="LED";
    }

    public void start(String samsungTV){

        int channel =0;
    }

    public void start(int  times){

        int channel =0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTvSize() {
        return tvSize;
    }

    public void setTvSize(int tvSize) {
        this.tvSize = tvSize;
    }


    public static void main(String[] args) {

        TV tv = new TV("LCD", 40);
        tv.getType();
        tv.setType("LED");


    }
}
