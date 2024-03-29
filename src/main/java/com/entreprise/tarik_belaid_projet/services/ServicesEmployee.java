package com.entreprise.tarik_belaid_projet.services;

import com.entreprise.tarik_belaid_projet.Dao.EmployeeImpl;
import com.entreprise.tarik_belaid_projet.Entity.Employee;

import java.util.List;

public class ServicesEmployee {
    private EmployeeImpl employee=new EmployeeImpl();
    public void addEmployee(Employee e){
        employee.addEmploye(e);
    }
    public List<Employee> showEmployees(){
        return employee.showEmployee();
    }
    public void deleteEmploye(long id){
        employee.delete(id);
    }
}
