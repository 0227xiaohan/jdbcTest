package com.neuedu.HomeWork;

public class Student {
    private   String  id;
    private   String  sno;
    private   String  sname;
    private   String  spsw;
    private   String  sage;
    private   String  ssex;
    private   String  sheight;
    private   String  sweight;
    private   String  sbirthday;
    private   String  sflag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpsw() {
        return spsw;
    }

    public void setSpsw(String spsw) {
        this.spsw = spsw;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSheight() {
        return sheight;
    }

    public void setSheight(String sheight) {
        this.sheight = sheight;
    }

    public String getSweight() {
        return sweight;
    }

    public void setSweight(String sweight) {
        this.sweight = sweight;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSflag() {
        return sflag;
    }

    public void setSflag(String sflag) {
        this.sflag = sflag;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", spsw='" + spsw + '\'' +
                ", sage='" + sage + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sheight='" + sheight + '\'' +
                ", sweight='" + sweight + '\'' +
                ", sbirthday='" + sbirthday + '\'' +
                ", sflag='" + sflag + '\'' +
                '}';
    }
}
