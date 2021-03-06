package com.iotek.dao;

import com.iotek.model.Department;
import com.iotek.model.Interview;

import java.util.List;

/**
 * Created by sakura���� on 2018/7/30.
 */
public interface DepartmentMapper {
    List<Department> getDepartment();
    List<Department> getDepartmentByPage( int begin, int end );
    void addNewDepartment(Department department);
    void deleteDepartment(Department department);
    void updateDepartment(Department department);
}
