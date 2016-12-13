package dao.impl.hibernate;

import dao.UserDao;
import dao.factory.HibernateConnectionFactory;
import model.User;
import org.hibernate.Session;

public class UserDaoHibernateImpl implements UserDao {
    public User getUserById(Long userId) {
        User user = null;
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            user = session.get(User.class, userId);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }
}
