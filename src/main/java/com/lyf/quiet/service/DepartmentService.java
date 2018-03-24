package com.lyf.quiet.service;

import com.lyf.quiet.entities.Department;

import java.util.List;

public interface DepartmentService {
	
	 int deleteByPrimaryKey(Integer depaId);

    int insert(Department record);

    Department selectByPrimaryKey(Integer depaId);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}
