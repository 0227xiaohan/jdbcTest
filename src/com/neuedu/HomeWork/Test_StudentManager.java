package com.neuedu.HomeWork;

import com.neuedu.biji.RowMap;

import java.sql.ResultSet;
import java.util.List;

public class Test_StudentManager {
    public static void main(String[] args) {
//    StudentManager.tool("insert  into student (id,sno,sname,spsw,sage,ssex,sheight,sweight,sbirthday,sflag)values (?,?,?,?,?,?,?,?,?,?)","1","001","小韩","ROOT","20","女","177","60","1999-02-27","1");
//    StudentManager.tool("insert  into student (id,sno,sname,spsw,sage,ssex,sheight,sweight,sbirthday,sflag)values (?,?,?,?,?,?,?,?,?,?)","2","002","小柴","ROOT","20","女","177","60","1999-02-27","1");

        new StudentManager().login();
        List<Teacher> list=StudentManager.excuteQuery("select * from   student", new RowMap<Teacher>() {
            @Override
            public Teacher rowMapping(ResultSet resultSet) {
                return null;
            }
        });
   }
}
