package com.entreprise.tarik_belaid_projet.Dao;

import com.entreprise.tarik_belaid_projet.Entity.Employee;

import java.util.List;

public interface Iemployee {
    public void addEmploye(Employee e);
    List<Employee> showEmployee();
    public void delete(long id);
}
