package dao.impl.jdbc;

import dao.CVDao;
import model.CV;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CVDaoJDBCImpl extends JDBCTemplate implements CVDao {

    public CV getCvById(Long cvId) {
        HashMap<Long, CV> cvMap = new HashMap<Long, CV>();
        String query = "SELECT * FROM cv " +
                "JOIN users u ON cv.user_id = u.id " +
                "JOIN cv_category cvc ON cv.id = cvc.cv_id " +
                "JOIN category c ON cvc.category_id = c.id " +
                "WHERE cv.id = ?";
        try {
            con = getConnection();
            ptmt = con.prepareStatement(query);
            ptmt.setLong(1, cvId);
            rs = ptmt.executeQuery();
            if (rs.next()) {
                CV.CV_ROW_MAPPER(rs, cvMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cvMap.get(cvId);
    }

    public List<CV> cvList() {
        HashMap<Long, CV> cvMap = new HashMap<Long, CV>();

        String query = "SELECT * FROM cv" +
                "  JOIN users ON cv.user_id = users.id" +
                "  JOIN cv_category ON cv.id = cv_category.cv_id" +
                "  JOIN category ON cv_category.category_id = category.id";

        try {
            con = getConnection();
            ptmt = con.prepareStatement(query);
            rs = ptmt.executeQuery();
            while (rs.next()) {
                CV.CV_ROW_MAPPER(rs, cvMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (List<CV>) cvMap.values();
    }

    public void add(CV cv) {
        //TODO: 12. add new CV to db by jdbc
    }
}
