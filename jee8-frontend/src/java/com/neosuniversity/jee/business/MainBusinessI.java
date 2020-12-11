/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neosuniversity.jee.business;

import com.neosuniversity.jee.beans.entity.Employee;
import java.util.List;

/**
 *
 * @author hhugohm
 */
public interface MainBusinessI {
    
    String getMessage(String name);
    List<Employee> getAllEmployees();
    
}
