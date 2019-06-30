package com.neuedu.HomeWork;

import com.neuedu.biji.RowMap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    //创建数据库连接
    private    static   final   String  URL="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8";
    private    static   final   String  ROOT="root";
    private    static   final   String  PSW="ROOT";
    //加载驱动
static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //创建连接
    public  static Connection  getConnection(){
    Connection connection=null;
        try {
            connection= DriverManager.getConnection(URL,ROOT,PSW);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  connection;
    }
  //  工具类，对增删改的功能做一个封装----使用动态参数传参
   public   static  int   tool(String sql,Object...objects){
       Connection  connection=null;
       PreparedStatement  preparedStatement=null;
       int   result=0;
       try {
           connection=getConnection();
           preparedStatement=connection.prepareStatement(sql);
           for (int i=0;i<objects.length;i++){
               preparedStatement.setObject(i+1,objects[i]);//i从0开始，参数？从1开始
           }
           result=preparedStatement.executeUpdate();//更新操作
       } catch (SQLException e) {
           e.printStackTrace();
       }finally {
           close(connection,preparedStatement,null);
       }


       //循环代替了多次传参
      return    result;
   }
   //查询方法
   public  static <T> List<T>  excuteQuery(String  sql, RowMap<T>  rowMap, Object...objects){
    List<T>  list=new ArrayList<>();
    Connection  connection=null;
    PreparedStatement    preparedStatement=null;
    ResultSet  resultSet=null;
    connection=getConnection();//数据库连接
       try {
           preparedStatement=connection.prepareStatement(sql);//创建查询窗口
           for (int i=0;i<objects.length;i++){
               preparedStatement.setObject(i+1,objects[i]);
           }
           resultSet=preparedStatement.executeQuery();//更新操作
           while (resultSet.next()){//拿到resulrSet,返回出当前类型对象  泛型T
               T  t=rowMap.rowMapping(resultSet);
               list.add(t);
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return  list ;
   }








        //关闭流的方法
      public static void  close(Connection  connection, PreparedStatement preparedStatement, ResultSet resultSet){
          if (resultSet!=null){
              try {
                  resultSet.close();
              } catch (SQLException e) {
                  e.printStackTrace();
              }
          }
          if (preparedStatement!=null){
              try {
                  preparedStatement.close();
              } catch (SQLException e) {
                  e.printStackTrace();
              }
          }
    if (connection!=null){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      }

    //权限管理：如果是学生，只可以看或修改自己的信息
    //老师，查看全部信息
         public   void   login(){
             System.out.println("请登录");
             System.out.println("用户名：");
             String  name =input.next();
             System.out.println("密码：");
             String psw=input.next();

             showMenu();
         }
  private Scanner  input=new Scanner(System.in);
    public   void   showMenu(){
        System.out.println("欢迎使用学生管理系统");
        System.out.println("输入编号选择功能");
        System.out.println("1 增");
        System.out.println("2 删");
        System.out.println("3 改");
        System.out.println("4 查");
        System.out.println("5 退出");

        int key =input.nextInt();
        switch (key){
            case 1:
              add();
            case 2:
               delete();
            case 3:
              update();
            case 4:
               select();
        }
    }
    public   void  add(){

    }
    public   void  delete(){

    }
    public   void update(){

    }
    public   void  select(){

    }

}
