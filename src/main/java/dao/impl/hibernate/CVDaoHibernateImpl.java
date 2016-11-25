package dao.impl.hibernate;

import dao.CVDao;
import dao.factory.HibernateConnectionFactory;
import model.CV;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class CVDaoHibernateImpl implements CVDao {
    public CV getCvById(Long cvId) {
        //TODO: 5 get cv by id, using hibernate
        return null;
    }

    public List<CV> cvList() {
      //TODO: 3. get list of cvs by hibernate
        return null;
    }

    public void add(CV cv) {
        //TODO: 12. add new CV to db by hibernate
    }
}
