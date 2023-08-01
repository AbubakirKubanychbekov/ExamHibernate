package GroupA;

import GroupA.config.HibernateConfig;
import GroupA.entities.Department;
import GroupA.entities.Employee;
import GroupA.service.DepartmentService;
import GroupA.service.EmployeeService;
import GroupA.service.impl.DepartmentServiceImpl;
import GroupA.service.impl.EmployeeServiceImpl;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

        HibernateConfig.getEntityManager();
        DepartmentService departmentService=new DepartmentServiceImpl();
        EmployeeService employeeService=new EmployeeServiceImpl();

    while (true){
        System.out.println("--- Department ---" +
                "\n1.Save" +
                "\n2.GetAll" +
                "\n3.Update" +
                "\n4.DeleteById" +
                "\n --- Employee ---" +
                "\n5.Save");
      switch (new Scanner(System.in).nextInt()){
        case 1->{
            departmentService.save(new Department("Nambe"));
            departmentService.save(new Department("Rheumatology"));
            departmentService.save(new Department("Endocrinology"));
            departmentService.save(new Department("Nephrology"));
        }case 2->{
            departmentService.getAll().forEach(System.out::println);
          }case 3-> {
              System.out.println(departmentService.update(1L, new Department("Symptomatology")));
          }case 4->{
              System.out.println(departmentService.deleteDepartment(2L));
          }case 5->{
             employeeService.save(3L,new Employee("Begimai","Kubatova",28,BigDecimal.valueOf(50000)));
          }
      }
    }

    }
}
