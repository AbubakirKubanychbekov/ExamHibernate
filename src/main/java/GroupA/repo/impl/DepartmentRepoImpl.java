package GroupA.repo.impl;

import GroupA.config.HibernateConfig;
import GroupA.entities.Department;
import GroupA.repo.DepartmentRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.awt.print.Book;
import java.util.List;

public class DepartmentRepoImpl implements DepartmentRepo {
private final EntityManagerFactory entityManager= HibernateConfig.getEntityManager();

    @Override
    public void save(Department department) {
        EntityManager entityManager1 = entityManager.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.persist(department);
        entityManager1.getTransaction().commit();
        entityManager1.close();
    }

    @Override
    public List<Department> getAll() {
        EntityManager entityManager1 = entityManager.createEntityManager();
        entityManager1.getTransaction().begin();
        List<Department> departments = entityManager1.createQuery("select d from Department d", Department.class).getResultList();
        entityManager1.getTransaction().commit();
        entityManager1.close();
        return departments;
    }

    @Override
    public Department update(Long id, Department department) {
        EntityManager entityManager1 = entityManager.createEntityManager();
        entityManager1.getTransaction().begin();
        Department department1 = entityManager1.find(Department.class, id);
        department1.setName(department.getName());
        entityManager1.getTransaction().commit();
        entityManager1.close();

        return department1;
    }

    @Override
    public String deleteDepartment(Long id) {
        EntityManager entityManager1 = entityManager.createEntityManager();
        entityManager1.getTransaction().begin();
        Department department = entityManager1.find(Department.class, id);
        entityManager1.remove(department);
        entityManager1.getTransaction().commit();
        entityManager1.close();
        return department.getName()+" is deleted...";
    }

    @Override
    public void getDepartmentByMaxEmployees() {

    }

}
