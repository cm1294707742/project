package com.iotek.service;

import com.iotek.model.Department;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/3.
 */
public interface DepartmentService {
    List<Department> getDepartment();
    List<Department> getDepartmentByPage( int begin, int end );
    void addNewDepartment(Department department);
    void deleteDepartment(Department department);
    void updateDepartment(Department department);
}
