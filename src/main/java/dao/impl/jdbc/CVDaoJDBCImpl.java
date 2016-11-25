package dao.impl.jdbc;

import dao.CVDao;
import model.CV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CVDaoJDBCImpl extends JDBCTemplate implements CVDao {

    public CV getCvById(Long cvId) {
        HashMap<Long,CV> cvMap = new HashMap<Long, CV>();

        //TODO: 5. create sql
        String query = "";
        //TODO: 6. get cv by id, using (cv row mapper)

        return cvMap.get(cvId);
    }

    public List<CV> cvList() {
        HashMap<Long,CV> cvMap = new HashMap<Long, CV>();
        //TODO: 3. create sql
        String query = "";
        //TODO: 4. get list of cvs by jdbc (use cv row mapper)
        return new ArrayList<CV>(cvMap.values());
    }

    public void add(CV cv) {
        //TODO: 12. add new CV to db by jdbc
    }
}
