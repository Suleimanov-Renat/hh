package dao;

import model.User;

public interface UserDao {

    User getUserById(Long userId);
}
