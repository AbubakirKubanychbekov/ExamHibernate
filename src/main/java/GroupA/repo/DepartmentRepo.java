package GroupA.repo;

import GroupA.entities.Department;

import java.util.List;

public interface DepartmentRepo {
void save(Department department);
List<Department> getAll();
Department update(Long id, Department department);
String deleteDepartment(Long id);
void getDepartmentByMaxEmployees();
}
