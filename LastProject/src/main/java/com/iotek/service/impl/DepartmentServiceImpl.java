package com.iotek.service.impl;

import com.iotek.dao.DepartmentMapper;
import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sakura¸¡³Á on 2018/8/3.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }

    public List<Department> getDepartmentByPage(int begin, int end) {
        return departmentMapper.getDepartmentByPage(begin,end);
    }

    public void addNewDepartment(Department department) {
            departmentMapper.addNewDepartment(department);
    }

    public void deleteDepartment(Department department) {
        departmentMapper.deleteDepartment(department);
    }

    public void updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
    }
}
