package com.yz.service;

import com.yz.exception.AppException;
import com.yz.model.Department;

import java.util.List;

public interface IDepartmentService {

    public List<Department> getAll() throws AppException;

    public void add(Department department) throws AppException;

    public void del(Integer id) throws AppException;

    public Department get(Integer id) throws AppException;

    public void update(Department department) throws AppException;
}
