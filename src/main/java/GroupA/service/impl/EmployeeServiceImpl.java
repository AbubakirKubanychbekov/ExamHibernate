package GroupA.service.impl;

import GroupA.entities.Department;
import GroupA.entities.Employee;
import GroupA.repo.EmployeeRepo;
import GroupA.repo.impl.EmployeeRepoImpl;
import GroupA.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepo employeeRepo=new EmployeeRepoImpl();

    @Override
    public void save(Long departmentId, Employee employee) {
        employeeRepo.save(departmentId,employee);

    }

    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public Department update(Long id, Employee employee) {
        return null;
    }

    @Override
    public String deleteDepartment(Long id) {
        return null;
    }
}
