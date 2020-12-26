package com.study.create_design.singleton;

import java.sql.*;

public class JDBCSingleton {
    //Step 1
    // create a JDBCSingleton class.
    //static member holds only one instance of the JDBCSingleton class.
    private static JDBCSingleton jdbc;

    //JDBCSingleton prevents the instantiation from any other class.
    private JDBCSingleton(){}

    //Now we are providing global point of access.
    public static JDBCSingleton getInstance(){
        if (jdbc == null){
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    // to get the connection from methods like insert, view etc
    private static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/defualt",
                                            "root","root");
        return con;
    }

    //to insert the record into the database
    public int insert(String name, String pass) throws SQLException
    {
        Connection con = null;

        PreparedStatement ps = null;

        int recordCounter = 0;
        try{
            con = this.getConnection();
            ps = con.prepareStatement("insert into userdata(uname, upassword) values(?,?)");
            ps.setString(1, name);
            ps.setString(2,pass);
            recordCounter = ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
            if (con != null) con.close();
        }
        return recordCounter;
    }

    //to view the data from the database
    public void view(String name) throws SQLException
    {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = this.getConnection();
            ps = con.prepareStatement("select * from userdata where uname = ?");
            ps.setString(1,name);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Name= " + rs.getString(2) +
                        "\t" + "Password= " + rs.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(con != null) con.close();
        }
    }

    // to update the password for the given username
    public int update(String name, String password) throws SQLException  {
        Connection c=null;
        PreparedStatement ps=null;

        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");
            ps.setString(1, password);
            recordCounter=ps.executeUpdate();
        } catch (Exception e) {  e.printStackTrace(); } finally{

            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
}
