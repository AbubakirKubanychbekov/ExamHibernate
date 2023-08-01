package GroupA.repo.impl;

import GroupA.config.HibernateConfig;
import GroupA.entities.Department;
import GroupA.entities.Employee;
import GroupA.repo.EmployeeRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo {
    private final EntityManagerFactory entityManager= HibernateConfig.getEntityManager();

    @Override
    public void save(Long departmentId,Employee employee) {
        EntityManager entityManager1 = entityManager.createEntityManager();
        entityManager1.getTransaction().begin();
        Department department1 = entityManager1.find(Department.class, departmentId);
        employee.setDepartment(department1);
        entityManager1.persist(employee);
        entityManager1.getTransaction().commit();
        entityManager1.close();

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
