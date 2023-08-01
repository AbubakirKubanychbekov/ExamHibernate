package GroupA.service;

import GroupA.entities.Department;
import GroupA.entities.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Long departmentId, Employee employee);
    List<Department> getAll();
    Department update(Long id, Employee employee);
    String deleteDepartment(Long id);
}
