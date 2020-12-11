/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neosuniversity.jee.business;

import com.neosuniversity.jee.beans.dao.EmployeeDao;
import com.neosuniversity.jee.beans.entity.Employee;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hhugohm
 */

@RequestScoped
public class MainBusinessImpl implements MainBusinessI{

   @EJB
   private EmployeeDao employeeDao;
     
     
    @Override
    public String getMessage(String name) {
      return "HELLO " + name;
    }

    @Override
    public List<Employee> getAllEmployees() {
       List<Employee> employees= employeeDao.getAllEmployees();
       employees.stream().forEach(action->System.out.println(action.getEmail()));
       return employees;
    }
    
}
