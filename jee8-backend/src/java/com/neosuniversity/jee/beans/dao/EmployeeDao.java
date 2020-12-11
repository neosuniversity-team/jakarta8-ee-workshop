/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neosuniversity.jee.beans.dao;

import com.neosuniversity.jee.beans.entity.Employee;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author hhugohm
 */
@Remote
public interface EmployeeDao {
    
    List<Employee> getAllEmployees();
    
}
