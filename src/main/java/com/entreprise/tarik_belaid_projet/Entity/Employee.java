package com.entreprise.tarik_belaid_projet.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    private String email;
    @ElementCollection
    @CollectionTable(name="Employee_Skills", joinColumns=@JoinColumn(name="employee_id"))
    @Column(name="skill")
    private List<String> skills;
    @ManyToMany(mappedBy = "employeeList",cascade = CascadeType.PERSIST)
    @JoinColumn(name ="Project_ID")
    private List<Project>project;
    public Employee() {
    }

    public Employee(String name, String email, List<String> skills, List<Project> project) {
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.project = project;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
