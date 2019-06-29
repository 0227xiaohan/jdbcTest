package com.neuedu.biji;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Jdbc_Test {

    static{
        try {
            new Driver();//报错原因，加载不到驱动，需要抛异常
            // SQL异常 :需要加载驱动.   new Driver();为加载驱动
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        inseraMethod();
        selectMethod();
    }

    //查询的方法
    public   static   void   selectMethod(){
        Connection connection=null;//提升作用域，初始值为null；
        Statement  statement=null;
        ResultSet   resultSet=null;
        try {
          connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/text?userUnicode=true&characterEncoding=utf8","root","ROOT");
           statement=connection.createStatement();//创建查询窗口
            String sql="select * from student";
              resultSet=statement.executeQuery(sql);//查询的更新操作,与增删改不同
            while (resultSet.next()){
                //getInt（n）获取第n列的内容，数据库中的列数是从1开始的,也可以在此写查询的列·
               int a=resultSet.getInt("sno");
                System.out.println(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{//关闭IO流   先创建的后关闭，后创建的先关闭
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }






 //   插入的方法   英文    中文
      public  static   void    inseraMethod(){
          Connection  connection=null;
          Statement  statement=null;
          try{
                connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/text?userUnicode=true&characterEncoding=utf8","root","ROOT");
                 statement=connection.createStatement();//创建查询窗口
                 String  sql="inset  into  student  values('111','韩先生','女','1999-2-27','5551')";
              int result= statement.executeUpdate(sql);//增删改均为：executeUpdate()更新操作
                 System.out.println(result);
             }catch (SQLException e) {
                 e.printStackTrace();
             }
             finally {
              try {
                  statement.close();
                  connection.close();
              } catch (SQLException e) {
                  e.printStackTrace();
              }

          }
             }
         }

////SQL注入：相对的安全，
////英文状态下的  ？  是占位
//
//PreparedStatement:每次SQL需要编辑一次，相对来说较为安全
//Prepared:
//动态参数必须放在参数列表后
//(int...ints);动态参数的格式
//动态参数和数组的关系：
 //对增删改查的一个封装方法，
