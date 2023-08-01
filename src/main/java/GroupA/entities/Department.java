package GroupA.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "departments")
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Department extends ParentClass {
 private String name;
 private int maxEmployeeNumber;
 @OneToMany( mappedBy = "department",cascade ={
         CascadeType.MERGE,
         CascadeType.PERSIST,
         CascadeType.REMOVE
 },fetch = FetchType.EAGER)
 private List<Employee> employees;


 public Department(String name) {
  this.name = name;
 }
}
