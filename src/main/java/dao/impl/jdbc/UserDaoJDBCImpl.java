package dao.impl.jdbc;

import dao.UserDao;
import model.User;

import java.sql.SQLException;
import java.util.HashMap;

public class UserDaoJDBCImpl extends JDBCTemplate implements UserDao {

    public User getUserById(Long userId) {
        HashMap<Long, User> userMap = new HashMap<Long, User>();
        String querystring = "SELECT * FROM users u INNER JOIN cv ON u.id = cv.user_id\n" +
                "WHERE u.id = ?;";
        try {
            con = getConnection();
            ptmt = con.prepareStatement(querystring);
            ptmt.setLong(1, userId);
            rs = ptmt.executeQuery();
            while (rs.next()) {
                User.USER_ROW_MAPPER(rs, userMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userMap.get(userId);
    }
}
