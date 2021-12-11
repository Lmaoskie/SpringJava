package com.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String name;
    private String location;
    private String department;

    public Employee (int id, int name, int location, int department)
    {
        employeeId = id;
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public Employee() {

    }

    public int getId() {
        return employeeId;
    }

    public void setId(int id) {
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



}

