package com.entreprise.tarik_belaid_projet.Dao;

import com.entreprise.tarik_belaid_projet.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeImpl implements Iemployee {
    @Override
    public void addEmploye(Employee e) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa_student");
        EntityManager em= emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
        }catch(Exception exception){
            exception.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }

    }

    @Override
    public List<Employee> showEmployee() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa_student");
        EntityManager em= emf.createEntityManager();
        try{
            em.getTransaction().begin();
            Query query=em.createQuery("select e from  Employee e");
            List<Employee>list=query.getResultList();
            em.getTransaction().commit();
            return list;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            em.close();
            emf.close();
        }

    }

    @Override
    public void delete(long id) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa_student");
        EntityManager em=emf.createEntityManager();
        try{
            em.getTransaction().begin();
            Employee s=em.find(Employee.class,id);
            em.remove(s);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }


    }
}
