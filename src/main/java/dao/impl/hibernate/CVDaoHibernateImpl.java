package dao.impl.hibernate;

import dao.CVDao;
import dao.factory.HibernateConnectionFactory;
import model.CV;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class CVDaoHibernateImpl implements CVDao {
    public CV getCvById(Long cvId) {
        CV cv = null;
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            cv = session.get(CV.class, cvId);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("OSHIBKA");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return cv;
    }

    public List<CV> cvList() {
        Session session = null;
        List list = new ArrayList();
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            list = session.createCriteria(CV.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return list;
    }

    public void add(CV cv) {
        Session session = null;
        try{
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.save(cv);
            session.beginTransaction().commit();
        }catch(NullPointerException e){

        }
    }
}
