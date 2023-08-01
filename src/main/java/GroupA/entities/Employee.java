package GroupA.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "employees")
@Getter  @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends ParentClass {
    @Column(name = "first_name")
private String firstName;
    @Column(name = "last_name")
private String lastName;
private int age;
private BigDecimal salary;
@ManyToOne(cascade = {
        CascadeType.REMOVE,
        CascadeType.MERGE,
        CascadeType.PERSIST
},fetch = FetchType.EAGER)
private Department department;




    public Employee(String firstName, String lastName, int age, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}
