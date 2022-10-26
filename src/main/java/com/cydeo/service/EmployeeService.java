package com.cydeo.service;


import com.cydeo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //Service classes are also beans so we need to add @component at the top
public class EmployeeService {


    public static List<Employee> employeeList = new ArrayList<>();

    public void saveEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> readAllEmployees(){
        return employeeList;
    }

}
