package com.neuedu.HomeWork;

public class Teacher {
    private   String  id;
    private   String  name;
    private   String  password;
    private   String  sflag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSflag() {
        return sflag;
    }

    public void setSflag(String sflag) {
        this.sflag = sflag;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sflag='" + sflag + '\'' +
                '}';
    }
}
