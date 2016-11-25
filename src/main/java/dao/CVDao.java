package dao;

import model.CV;

import java.util.List;

public interface CVDao {

    CV getCvById(Long cvId);

    List<CV> cvList();

    void add(CV cv);
}
