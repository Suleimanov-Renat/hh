package dao.impl.jdbc;

import dao.UserDao;
import model.User;

import java.sql.SQLException;
import java.util.HashMap;

public class UserDaoJDBCImpl extends JDBCTemplate implements UserDao {
    public User getUserById(Long userId) {
        HashMap<Long, User> userMap = new HashMap<Long, User>();
        //TODO: 8 create sql
            String querystring = "";

        //TODO: 9. get user by id. Use user row mapper

        return userMap.get(userId);
    }
}
