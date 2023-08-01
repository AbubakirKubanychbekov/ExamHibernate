package GroupA.service.impl;

import GroupA.entities.Department;
import GroupA.repo.DepartmentRepo;
import GroupA.repo.impl.DepartmentRepoImpl;
import GroupA.service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    DepartmentRepo departmentRepo=new DepartmentRepoImpl();
    @Override
    public void save(Department department) {
      departmentRepo.save(department);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepo.getAll();
    }

    @Override
    public Department update(Long id, Department department) {
        return departmentRepo.update(id,department);
    }

    @Override
    public String deleteDepartment(Long id) {
        return departmentRepo.deleteDepartment(id);
    }
}
