package com.codegym.service;

import com.codegym.model.Department;

public interface DepartmentService {
    Iterable<Department> findAll();

    Department findById(Long id);

    void save(Department department);

    void delete(Long id);
}
