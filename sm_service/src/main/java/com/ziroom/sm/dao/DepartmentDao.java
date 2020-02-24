package com.ziroom.sm.dao;

import com.ziroom.sm.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentService")
public interface DepartmentDao {

    void insert(Department dapartment);
    void delete(Integer id);
    void update(Department dapartment);
    Department selectById(Integer id);
    List<Department> selectAll();
}
