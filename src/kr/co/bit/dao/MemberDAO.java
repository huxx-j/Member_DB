package kr.co.bit.dao;

import kr.co.bit.database.ConnectionManager;
import kr.co.bit.vo.MemberVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

    public ArrayList<MemberVO> selectAll(){

        ArrayList<MemberVO> list = null;
        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.getConnection();
        Statement statement;

        try {
            statement = connection.createStatement();
            String sql = "select * from departments";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String temp1 = resultSet.getString(1);
                String temp2 = resultSet.getString(2);
                String temp3 = resultSet.getString(3);
                String temp4 = resultSet.getString(4);
                System.out.println(temp1 + ", " + temp2 + ", " + temp3 + ", " + temp4);
            }
            connectionManager.connectClose(connection,statement,resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }
}
