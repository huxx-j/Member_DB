package kr.co.bit.database;

import java.sql.*;

public class ConnectionManager {

    public Connection getConnection() {
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:59161:xe";
        String driver = "oracle.jdbc.OracleDriver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url,"hr","oracle");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void connectClose(Connection con, Statement stmt, ResultSet rs) {
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
