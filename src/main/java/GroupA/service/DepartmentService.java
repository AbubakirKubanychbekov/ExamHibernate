package GroupA.service;

import GroupA.entities.Department;

import java.util.List;

public interface DepartmentService {
    void save(Department department);
    List<Department> getAll();
    Department update(Long id, Department department);
    String deleteDepartment(Long id);
}
