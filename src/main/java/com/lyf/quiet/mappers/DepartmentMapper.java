package com.lyf.quiet.mappers;

import com.lyf.quiet.entities.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer depaId);

    int insert(Department record);

    Department selectByPrimaryKey(Integer depaId);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}