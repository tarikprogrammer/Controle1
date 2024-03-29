package com.entreprise.tarik_belaid_projet.Web;

import com.entreprise.tarik_belaid_projet.Dao.EmployeeImpl;
import com.entreprise.tarik_belaid_projet.Entity.Employee;
import com.entreprise.tarik_belaid_projet.Entity.Post;
import com.entreprise.tarik_belaid_projet.Entity.Project;
import com.entreprise.tarik_belaid_projet.services.ServicesEmployee;
import jakarta.annotation.ManagedBean;

import java.io.Serializable;
import java.util.List;

@ManagedBean

public class EmployeeBean implements Serializable {
   private long id;
   private String name;
   private String email;
   private List<Employee> Skill;
   private List<Post>posts;

   private Project project;
   private String Implications;


    public EmployeeBean() {
    }

    public EmployeeBean(String name, String email, List<Employee> skill, Project project,List<Post> post) {
        this.name = name;
        this.email = email;
        Skill = skill;
        this.project = project;
        this.posts=post;
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

    public List<Employee> getSkill() {
        return Skill;
    }

    public void setSkill(List<Employee> skill) {
        Skill = skill;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getImplications() {
        return Implications;
    }

    public void setImplications(String implications) {
        Implications = implications;
    }

    public void addUser(){
        Employee employee=new Employee();
        employee.setName(name);
        employee.setProject((List<Project>) project);
        ServicesEmployee servicesEmployee=new ServicesEmployee();
        servicesEmployee.addEmployee(employee);
    }

}
