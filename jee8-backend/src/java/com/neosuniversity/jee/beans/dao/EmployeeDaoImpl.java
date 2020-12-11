/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neosuniversity.jee.beans.dao;

import com.neosuniversity.jee.beans.entity.Employee;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author hhugohm
 */
@Stateless(name="EmployeeDao")//En tiempo de Runtime ya es un EJB -->No necesita guardar el estado
//@TransactionManagement(TransactionManagementType.BEAN) // uso manual de la transacional - demarcado munualmente
public class EmployeeDaoImpl implements EmployeeDao{

    @PersistenceContext(name = "LibraryPU")
    private EntityManager jpa;
     
     
    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("EN EL EJB!!!");
         //TypedQuery<Employee> query= this.jpa.createNamedQuery("getAllEmployees", Employee.class);
        //return query.getResultList();
        return jpa.createQuery("SELECT e FROM Employee e").getResultList();
    }
    
    
    
}
