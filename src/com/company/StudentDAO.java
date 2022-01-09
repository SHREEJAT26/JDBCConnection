package com.company;

import java.sql.*;



public class StudentDAO
{
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private String username="system";
    private String password ="system";



    public void selectAllRows() throws ClassNotFoundException, SQLException {
        //load driver
        Class.forName(driver);


        //get connection
        Connection conn = DriverManager.getConnection(url, username, password);

        //execute query
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from gfg");
        //ResultSet rs = stat.executeQuery("update gfg set empname='Shreeja' where id=100");
        //ResultSet rs = stat.executeQuery("insert into gfg(id,empname) values(400,'Mythri')");


        while(rs.next())
        {

            Integer ID = rs.getInt(1);
            String EMPNAME = rs.getString(2);

            System.out.println(ID+"  "+EMPNAME);
        }

    }
}
