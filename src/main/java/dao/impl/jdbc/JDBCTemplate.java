package dao.impl.jdbc;

import dao.factory.JDBCConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTemplate {

    Connection con = null;
    PreparedStatement ptmt = null;
    ResultSet rs = null;

    Connection getConnection() throws SQLException {
        return JDBCConnectionFactory.getInstance().getConnection();
    }


    void closeConnection() {
        try {
            if (rs != null)
                rs.close();
            if (ptmt != null)
                ptmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
