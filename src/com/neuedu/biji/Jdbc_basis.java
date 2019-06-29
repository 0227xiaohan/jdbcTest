package com.neuedu.biji;

public class Jdbc_basis {
    private    int  sno;
    private   String  sname;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Jdbc_basis{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
