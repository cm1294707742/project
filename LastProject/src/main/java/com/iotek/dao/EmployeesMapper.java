package com.iotek.dao;

import com.iotek.model.Department;
import com.iotek.model.Employees;
import com.iotek.model.Title;

import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/7/31.
 */
public interface EmployeesMapper {
    void addNewEmployees(Employees employees);
    void deleteEmployees(Employees employees);
    List<Employees> getAllEmployees();
    List<Employees> getAllEmployeesByPages(int begin,int end);
    List<Employees> getAllEmployeesByDepartmemt(Department department);
    List<Employees> getAllEmployeesByDepartmentPages(int begin,int end);
    List<Employees> getAllEmployeesByDepartmentAndTitle(Department department, Title title);
    List<Employees> getAllEmployeesByDepartmentAndTitlePages(int begin,int end);

}
