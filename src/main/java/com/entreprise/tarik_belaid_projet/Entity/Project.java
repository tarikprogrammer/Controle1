package com.entreprise.tarik_belaid_projet.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    private double budget;
    @ManyToMany(mappedBy = "project",cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Employe_ID")
    private List<Employee> employeeList;

    public Project() {
    }

    public Project( String name, double budget, List<Employee> employeeList) {
        this.name = name;
        this.budget = budget;
        this.employeeList = employeeList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
