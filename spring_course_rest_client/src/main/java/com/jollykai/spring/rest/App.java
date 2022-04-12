package com.jollykai.spring.rest;

import com.jollykai.spring.rest.configuration.MyConfig;
import com.jollykai.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(2);
//        System.out.println(empByID);
        
//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(7);
//        communication.saveOrUpdateEmployee(emp);

        communication.deleteEmployee(7);

    }
}
